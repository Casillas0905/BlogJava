package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Post.Post;
import GrpcClasses.Post.PostGrpcGrpc;
import GrpcClasses.User.User;
import com.ServerSep3.Server.Model.*;
import com.ServerSep3.Server.Service.CategoryService;
import com.ServerSep3.Server.Service.LocationService;
import com.ServerSep3.Server.Service.PostService;
import com.ServerSep3.Server.Service.UserService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@GRpcService
public class PostGrpcImpl extends PostGrpcGrpc.PostGrpcImplBase {

    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    LocationService locationService;

    public PostGrpcImpl() {
    }

    @Override
    public void createPost(Post.PostModelGrpc request, StreamObserver<Post.Empty> responseObserver) {
        UserModel user= userService.findById(request.getUserId());
        CategoryModel category= categoryService.findById(request.getCategory());
        LocationModel location= locationService.findById(request.getLocation());
        PostModel postModel= new PostModel(request.getId(),
                user,
                category,
                request.getTitle(),
                request.getDescription(),
                request.getImageUrl(),
                location);
        postService.createPost(postModel);
        Post.Empty empty = Post.Empty.newBuilder().build();
        responseObserver.onNext(empty);
        responseObserver.onCompleted();
    }

    @Override
    public void findById(Post.GetById request, StreamObserver<Post.PostModelGrpc> responseObserver) {
        PostModel model=postService.findById(request.getId());
        if (model == null){
            System.out.println("its null");
            Post.PostModelGrpc response= Post.PostModelGrpc.newBuilder()
                    .setCategory(0)
                    .setId(0)
                    .setDescription("niull")
                    .setImageUrl("niull")
                    .setUserId(0)
                    .setLocation(0)
                    .setTitle("niull")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        else {
            Post.PostModelGrpc response= Post.PostModelGrpc.newBuilder()
                    .setCategory(model.getCategory().getId())
                    .setId(model.getId())
                    .setDescription(model.getDescription())
                    .setImageUrl(model.getImageUrl())
                    .setUserId(model.getUser().getId())
                    .setLocation(model.getLocation().getId())
                    .setTitle(model.getTitle())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void updatePost(Post.PostModelGrpc request, StreamObserver<Post.Empty> responseObserver) {
        UserModel user= userService.findById(request.getUserId());
        CategoryModel category= categoryService.findById(request.getCategory());
        LocationModel location= locationService.findById(request.getLocation());
        PostModel postModel= new PostModel(request.getId(),
                user,
                category,
                request.getTitle(),
                request.getDescription(),
                request.getImageUrl(),
                location);
        postService.updatePost(postModel);
        Post.Empty empty = Post.Empty.newBuilder().build();
        responseObserver.onNext(empty);
        responseObserver.onCompleted();
    }

    @Override
    public void deletePost(Post.GetById request, StreamObserver<Post.Empty> responseObserver) {
        postService.deletePost(request.getId());
        responseObserver.onCompleted();
    }

    @Override
    public void findByParameters(Post.SearchParameters request, StreamObserver<Post.PostModelGrpc> responseObserver) {
        SearchParameters parameters=new SearchParameters(request.getTitle(), request.getLocation(), request.getCategory(),request.getUserId());
        if(parameters.getTitle().equals("niull")){
            parameters.setTitle(null);
        }
        if(parameters.getLocation().equals("niull")){
            parameters.setLocation(null);
        }
        if(parameters.getCategory().equals("niull")){
            parameters.setCategory(null);
        }
        List<PostModel> list= postService.findByParameters(parameters);
        List<Post.PostModelGrpc> listGrpc= new ArrayList<>();
        for (int i=0;i< list.size();i++){
            Post.PostModelGrpc post= Post.PostModelGrpc.newBuilder()
                    .setCategory(list.get(i).getCategory().getId())
                    .setId(list.get(i).getId())
                    .setDescription(list.get(i).getDescription())
                    .setImageUrl(list.get(i).getImageUrl())
                    .setUserId(list.get(i).getUser().getId())
                    .setLocation(list.get(i).getLocation().getId())
                    .setTitle(list.get(i).getTitle())
                    .build();
            listGrpc.add(post);
        }
        for(Post.PostModelGrpc postModelGrpc : listGrpc){
            responseObserver.onNext(postModelGrpc);
        }
        responseObserver.onCompleted();
    }
    @Override
    public void findByUserId(Post.GetById request, StreamObserver<Post.PostModelGrpc> responseObserver) {
        List<PostModel> list= postService.findByUserId(request.getId());
        List<Post.PostModelGrpc> listGrpc= new ArrayList<>();
        for (int i=0;i< list.size();i++){
            Post.PostModelGrpc post= Post.PostModelGrpc.newBuilder()
                    .setCategory(list.get(i).getCategory().getId())
                    .setId(list.get(i).getId())
                    .setDescription(list.get(i).getDescription())
                    .setImageUrl(list.get(i).getImageUrl())
                    .setUserId(list.get(i).getUser().getId())
                    .setLocation(list.get(i).getLocation().getId())
                    .setTitle(list.get(i).getTitle())
                    .build();
            listGrpc.add(post);
        }
        for(Post.PostModelGrpc postModelGrpc : listGrpc){
            responseObserver.onNext(postModelGrpc);
        }
        responseObserver.onCompleted();
    }
}
