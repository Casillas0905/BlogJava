package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Comment.Comment;
import GrpcClasses.SavePost.SavePost;
import GrpcClasses.SavePost.SavePostGrpcGrpc;
import com.ServerSep3.Server.Model.CommentModel;
import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Model.SaveModel;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.PostService;
import com.ServerSep3.Server.Service.SaveService;
import com.ServerSep3.Server.Service.UserService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@GRpcService
public class SaveGrpcImpl extends SavePostGrpcGrpc.SavePostGrpcImplBase {
    @Autowired
    SaveService saveService;
    @Autowired
    UserService userService;
    @Autowired
    PostService postService;
    @Override
    public void saveSavePost(SavePost.SaveModelGrpc request, StreamObserver<SavePost.Empty> responseObserver) {
        UserModel user= userService.findById(request.getUserId());
        PostModel post=postService.findById(request.getPostId());
        SaveModel saveModel= new SaveModel(request.getId(), user,post);
        saveService.saveSave(saveModel);
        SavePost.Empty empty= SavePost.Empty.newBuilder().build();
        responseObserver.onNext(empty);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteById(SavePost.GetById request, StreamObserver<SavePost.Empty> responseObserver) {
        saveService.deleteSaveById(request.getId());
        SavePost.Empty empty= SavePost.Empty.newBuilder().build();
        responseObserver.onNext(empty);
        responseObserver.onCompleted();
    }

    @Override
    public void findByUserId(SavePost.SaveModelGrpc request, StreamObserver<SavePost.SaveModelGrpc> responseObserver) {
        List<SaveModel> list= saveService.findByUserId(request.getId());
        List<SavePost.SaveModelGrpc> listGrpc= new ArrayList<>();
        for (int i=0;i< list.size();i++){
            SavePost.SaveModelGrpc comment= SavePost.SaveModelGrpc.newBuilder()
                    .setId(list.get(i).getId())
                    .setPostId(list.get(i).getPostSave().getId())
                    .setUserId(list.get(i).getUser().getId())
                    .build();
            listGrpc.add(comment);
        }
        System.out.println("Size save:"+listGrpc.size());
        for(SavePost.SaveModelGrpc saveModelGrpc : listGrpc){
            responseObserver.onNext(saveModelGrpc);
        }
        responseObserver.onCompleted();
    }
}
