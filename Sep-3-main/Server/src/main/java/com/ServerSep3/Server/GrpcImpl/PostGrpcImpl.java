package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Post.Post;
import GrpcClasses.Post.PostGrpcGrpc;
import GrpcClasses.User.User;
import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.PostService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@GRpcService
public class PostGrpcImpl extends PostGrpcGrpc.PostGrpcImplBase {

    @Autowired
    PostService postService;

    public PostGrpcImpl() {
    }

    @Override
    public void createPost(Post.PostModelGrpc request, StreamObserver<Post.Empty> responseObserver) {
        PostModel postModel= new PostModel(request.getId(),
                request.getUserId(),
                request.getCategory(),
                request.getTitle(),
                request.getDescription(),
                request.getImageUrl(),
                request.getLocation());
        postService.createPost(postModel);
        Post.Empty empty = Post.Empty.newBuilder().build();
        responseObserver.onNext(empty);
        responseObserver.onCompleted();
    }
}
