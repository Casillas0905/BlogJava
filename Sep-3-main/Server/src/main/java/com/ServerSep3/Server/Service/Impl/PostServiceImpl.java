package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Model.SearchParameters;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Repository.PostRepository;
import com.ServerSep3.Server.Repository.UserRepository;
import com.ServerSep3.Server.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public PostModel createPost(PostModel postModel) {
        UserModel user= userRepository.findById(postModel.getUser().getId());
        if(user == null){
            return null;
        }
        return postRepository.save(postModel);
    }

    @Override
    public List<PostModel> findByParameters(SearchParameters parameters) {
            List<PostModel> list = new ArrayList<>();
            boolean filterByTitle = parameters.getTitle() != null;
            boolean filterByCategory = parameters.getCategory() != null;
            boolean filterByLocation = parameters.getLocation() != null;
            boolean filterByUserId = parameters.getUserId() != 0;

            for (PostModel post : postRepository.findAll()) {
                if ((!filterByTitle || post.getTitle().equalsIgnoreCase(parameters.getTitle()))
                        && (!filterByCategory || post.getCategory().getCategory().equalsIgnoreCase(parameters.getCategory()))
                        && (!filterByLocation || post.getLocation().getLocation().equalsIgnoreCase(parameters.getLocation()))
                        && (!filterByUserId || post.getUser().getId() == parameters.getUserId())) {
                    list.add(post);
                }
            }

            return list;
        }

    @Override
    public PostModel findById(int id) {
        return postRepository.findById(id);
    }

    @Override
    public List<PostModel> findByUserId(int id) {
        return postRepository.findByUserId(id);
    }

    @Override
    public PostModel updatePost(PostModel postModel) {
        PostModel existing= postRepository.findById(postModel.getId());
        existing.setCategory(postModel.getCategory());
        existing.setLocation(postModel.getLocation());
        existing.setDescription(postModel.getDescription());
        existing.setTitle(postModel.getTitle());
        existing.setImageUrl(postModel.getImageUrl());
        return postRepository.save(existing);

    }

    @Override
    public void deletePost(int id) {
        postRepository.deleteById(Long.valueOf(id));
    }
}
