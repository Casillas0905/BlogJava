package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Comment.Comment;
import GrpcClasses.Comment.CommentGrpcGrpc;
import GrpcClasses.Post.Post;
import GrpcClasses.User.User;
import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.CommentModel;
import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.CategoryService;
import com.ServerSep3.Server.Service.CommentService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@GRpcService
public class CommentGrpcImpl extends CommentGrpcGrpc.CommentGrpcImplBase {

    @Autowired
    CommentService commentService;
    @Autowired
    CategoryService categoryService;

    @Override
    public void saveComment(Comment.CommentModelGrpc request, StreamObserver<Comment.Empty> responseObserver) {
        Date date= new Date(request.getUser().getYear(),request.getUser().getMonth(), request.getUser().getDay());
        CategoryModel category= categoryService.findById(request.getPost().getCategory());
        UserModel user= new UserModel(request.getUser().getId(),
                request.getUser().getFirstName(),
                request.getUser().getPassword(),
                request.getUser().getEmail(),
                request.getUser().getLastName(),
                date,
                request.getUser().getAdministrator());
        PostModel post= new PostModel(request.getId(),
                user,
                category,
                request.getPost().getTitle(),
                request.getPost().getDescription(),
                request.getPost().getImageUrl(),
                request.getPost().getLocation());
        CommentModel commentModel= new CommentModel(request.getMessage(), request.getId(), user,post);
        commentService.saveComment(commentModel);
    }

    @Override
    public void findByPostId(Comment.GetByPostId request, StreamObserver<Comment.CommentModelGrpc> responseObserver) {
        List<CommentModel> list= commentService.findByPostId(request.getId());
        List<Comment.CommentModelGrpc> listGrpc= new ArrayList<>();
        for (int i=0;i< list.size();i++){
            Comment.PostModelGrpc post= Comment.PostModelGrpc.newBuilder()
                    .setCategory(list.get(i).getPost().getCategory().getId())
                    .setId(list.get(i).getPost().getId())
                    .setDescription(list.get(i).getPost().getDescription())
                    .setImageUrl(list.get(i).getPost().getImageUrl())
                    .setUserId(list.get(i).getUser().getId())
                    .setLocation(list.get(i).getPost().getLocation())
                    .setTitle(list.get(i).getPost().getTitle())
                    .build();
            Comment.UserModelGrpc user= Comment.UserModelGrpc.newBuilder()
                    .setFirstName(list.get(i).getUser().getFirstname())
                    .setId(list.get(i).getUser().getId())
                    .setPassword(list.get(i).getUser().getPassword())
                    .setEmail(list.get(i).getUser().getEmail())
                    .setLastName(list.get(i).getUser().getLastName())
                    .setDay(list.get(i).getUser().getBirthday().getDay())
                    .setYear(list.get(i).getUser().getBirthday().getYear())
                    .setMonth(list.get(i).getUser().getBirthday().getMonth())
                    .setAdministrator(list.get(i).getUser().isAdministrator())
                    .build();
            Comment.CommentModelGrpc comment= Comment.CommentModelGrpc.newBuilder()
                    .setId(list.get(i).getId())
                    .setMessage(list.get(i).getMessage())
                    .setUser(user)
                    .setPost(post)
                    .build();
            listGrpc.add(comment);
        }
        for(Comment.CommentModelGrpc commentModelGrpc : listGrpc){
            responseObserver.onNext(commentModelGrpc);
        }
        responseObserver.onCompleted();
    }
}
