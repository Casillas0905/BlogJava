package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Category.Category;
import GrpcClasses.Category.CategoryGrpcGrpc;
import GrpcClasses.Post.Post;
import GrpcClasses.User.User;
import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Model.SearchParameters;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.CategoryService;
import com.ServerSep3.Server.Service.UserService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@GRpcService
public class CategoryGrpcImpl extends CategoryGrpcGrpc.CategoryGrpcImplBase {
    @Autowired
    CategoryService categoryService;

    public CategoryGrpcImpl() {
    }

    @Override
    public void saveCategory(Category.CategoryModelGrpc request, StreamObserver<Category.Empty> responseObserver) {
        CategoryModel categoryModel= new CategoryModel(request.getCategory(), request.getId());
        categoryService.save(categoryModel);
    }

    @Override
    public void findAll(Category.Empty request, StreamObserver<Category.CategoryModelGrpc> responseObserver) {
        List<CategoryModel> list= categoryService.findAll();
        List<Category.CategoryModelGrpc> listGrpc= new ArrayList<>();
        for (int i=0;i< list.size();i++){
            Category.CategoryModelGrpc post= Category.CategoryModelGrpc.newBuilder()
                    .setCategory(list.get(i).getCategory())
                    .setId(list.get(i).getId())
                    .build();
            listGrpc.add(post);
        }
        for(Category.CategoryModelGrpc categoryModelGrpc : listGrpc){
            responseObserver.onNext(categoryModelGrpc);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void findById(Category.GetByPostId request, StreamObserver<Category.CategoryModelGrpc> responseObserver) {
        CategoryModel model=categoryService.findById(request.getId());
        if (model == null){
            System.out.println("its null");
            Category.CategoryModelGrpc response= Category.CategoryModelGrpc.newBuilder()
                    .setCategory("niull")
                    .setId(0)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        else {
            Category.CategoryModelGrpc response= Category.CategoryModelGrpc.newBuilder()
                    .setCategory(model.getCategory())
                    .setId(model.getId())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
