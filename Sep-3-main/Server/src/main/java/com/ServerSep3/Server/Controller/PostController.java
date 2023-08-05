package com.ServerSep3.Server.Controller;

import GrpcClasses.Post.Post;
import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.LikeService;
import com.ServerSep3.Server.Service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/like")
public class PostController {

    private final LikeService likeService;

    public PostController(LikeService postService) {
        this.likeService = postService;
    }

    @GetMapping("/findByPostId/{id}")
    public int findByPostId(@PathVariable("id") int id){
        return likeService.findLikesByPostLiked(id).size();
    }
}
