package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Model.SearchParameters;

import java.util.List;
import java.util.Optional;

public interface PostService {
    PostModel createPost(PostModel postModel);
    List<PostModel> findByParameters(SearchParameters parameters);
    PostModel findById(int id);
    List<PostModel> findByUserId(int id);
    PostModel updatePost(PostModel postModel);
    void deletePost(int id);
}
