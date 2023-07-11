package com.ServerSep3.Server.Controller;

import GrpcClasses.Post.Post;
import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.PostService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/save")
    public PostModel saveUser(@RequestBody PostModel postModel) {
        return postService.createPost(postModel);
    }
}
