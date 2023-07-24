package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Comment.Comment;
import GrpcClasses.Comment.CommentGrpcGrpc;
import GrpcClasses.Post.Post;
import com.ServerSep3.Server.Model.CommentModel;
import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.CommentService;
import com.ServerSep3.Server.Service.PostService;
import com.ServerSep3.Server.Service.UserService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@GRpcService
public class CommentGrpcImpl extends CommentGrpcGrpc.CommentGrpcImplBase {

    @Autowired
    UserService userService;
    @Autowired
    PostService postService;
    @Autowired
    CommentService commentService;


    @Override
    public void saveComment(Comment.CommentModelGrpc request, StreamObserver<Comment.Empty> responseObserver) {
        UserModel user= userService.findById(request.getUserId());
        PostModel post=postService.findById(request.getPostId());
        CommentModel commentModel= new CommentModel(request.getMessage(), request.getId(), user,post);
        commentService.saveComment(commentModel);
        Comment.Empty empty = Comment.Empty.newBuilder().build();
        responseObserver.onNext(empty);
        responseObserver.onCompleted();
    }

    @Override
    public void findByPostId(Comment.GetByPostId request, StreamObserver<Comment.CommentModelGrpc> responseObserver) {
        List<CommentModel> list= commentService.findByPostId(request.getId());
        List<Comment.CommentModelGrpc> listGrpc= new ArrayList<>();
        for (int i=0;i< list.size();i++){
            Comment.CommentModelGrpc comment= Comment.CommentModelGrpc.newBuilder()
                    .setId(list.get(i).getId())
                    .setMessage(list.get(i).getMessage())
                    .setUserId(list.get(i).getUser().getId())
                    .setPostId(list.get(i).getPost().getId())
                    .build();
            listGrpc.add(comment);
        }
        for(Comment.CommentModelGrpc commentModelGrpc : listGrpc){
            responseObserver.onNext(commentModelGrpc);
        }
        responseObserver.onCompleted();
    }
}
