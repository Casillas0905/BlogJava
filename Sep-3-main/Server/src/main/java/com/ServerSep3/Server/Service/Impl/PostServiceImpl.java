package com.ServerSep3.Server.Service.Impl;

import GrpcClasses.User.User;
import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Repository.PostRepository;
import com.ServerSep3.Server.Repository.UserRepository;
import com.ServerSep3.Server.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public PostModel createPost(PostModel postModel) {
        UserModel user= userRepository.findById(postModel.getUserId());
        if(user == null){
            return null;
        }
        return postRepository.save(postModel);
    }
}
