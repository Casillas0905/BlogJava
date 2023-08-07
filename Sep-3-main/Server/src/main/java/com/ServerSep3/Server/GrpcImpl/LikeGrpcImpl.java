package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.LikePost.LikePost;
import GrpcClasses.LikePost.LikePostGrpcGrpc;
import GrpcClasses.SavePost.SavePost;
import com.ServerSep3.Server.Model.LikeModel;
import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Model.SaveModel;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.LikeService;
import com.ServerSep3.Server.Service.PostService;
import com.ServerSep3.Server.Service.UserService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class LikeGrpcImpl extends LikePostGrpcGrpc.LikePostGrpcImplBase {

    @Autowired
    LikeService likeService;
    @Autowired
    UserService userService;
    @Autowired
    PostService postService;
    @Override
    public void saveLike(LikePost.LikeModelGrpc request, StreamObserver<LikePost.Empty> responseObserver) {
        UserModel user= userService.findById(request.getUserIdLiking());
        PostModel post=postService.findById(request.getPostIdLiked());
        LikeModel likeModel= new LikeModel(request.getId(), user,post);
        likeService.saveLike(likeModel);
        LikePost.Empty empty= LikePost.Empty.newBuilder().build();
        responseObserver.onNext(empty);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteById(LikePost.PostUserId request, StreamObserver<LikePost.Empty> responseObserver) {
        likeService.deleteLikeByPostLikedAndUserLiking(request.getPostId(), request.getUserId());
        LikePost.Empty empty= LikePost.Empty.newBuilder().build();
        responseObserver.onNext(empty);
        responseObserver.onCompleted();
    }

    @Override
    public void findLikesByPostId(LikePost.GetById request, StreamObserver<LikePost.Count> responseObserver) {
        int likes=likeService.findLikesByPostLiked(request.getId()).size();
        LikePost.Count count= LikePost.Count.newBuilder().setCount(likes).build();
        responseObserver.onNext(count);
        responseObserver.onCompleted();
    }

    @Override
    public void findByPostLikedAndUserLiking(LikePost.PostUserId request, StreamObserver<LikePost.IsLiked> responseObserver) {
        boolean result=likeService.findByPostLikedAndUserLiking(request.getPostId(),request.getUserId());
        LikePost.IsLiked isLiked= LikePost.IsLiked.newBuilder().setIsliked(result).build();
        responseObserver.onNext(isLiked);
        responseObserver.onCompleted();
    }
}
