package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.UserInEvents.UsersInEventsGrpc;
import GrpcClasses.UserInEvents.UsersInEventsOuterClass;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Model.UsersInEvents;
import com.ServerSep3.Server.Service.UsersInEventsService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class UsersInEventsGrpcImpl extends UsersInEventsGrpc.UsersInEventsImplBase {
    @Autowired
    UsersInEventsService service;

    @Override
    public void findAllUsersForOneEvent(UsersInEventsOuterClass.RequestUsersInEventId request, StreamObserver<UsersInEventsOuterClass.UserModel> responseObserver) {
        System.out.println("Find all users for one event");
        List<UserModel> users= service.findAllUserForOneEvent(request.getId());
        for (int i=0;i< users.size();i++){
            UsersInEventsOuterClass.UserModel user= UsersInEventsOuterClass.UserModel.newBuilder()
                    .setFirstName(users.get(i).getFirstName())
                    .setLastName(users.get(i).getLastName())
                    .setId(users.get(i).getId()).build();
            responseObserver.onNext(user);
        }
        responseObserver.onCompleted();
        System.out.println("All users found");
    }

    @Override
    public void saveUsersInEvents(UsersInEventsOuterClass.UsersInEventsModel request, StreamObserver<UsersInEventsOuterClass.Empty> responseObserver) {
        System.out.println("Save user in event");
        UsersInEvents usersInEvents= new UsersInEvents(request.getId(), request.getEventId(),request.getUserId());
        service.saveUserInEvent(usersInEvents);
        responseObserver.onCompleted();
        System.out.println("User save");
    }

    @Override
    public void deleteUser(UsersInEventsOuterClass.UsersInEventsModel request, StreamObserver<UsersInEventsOuterClass.Empty> responseObserver) {
        System.out.println("Delete in event");
        UsersInEvents usersInEvents= new UsersInEvents(request.getId(), request.getEventId(),request.getUserId());
        service.deleteUser(usersInEvents);
        UsersInEventsOuterClass.UsersInEventsModel response= UsersInEventsOuterClass.UsersInEventsModel.newBuilder().setEventId(request.getEventId()).setUserId(request.getUserId()).setId(request.getId()).build();
        responseObserver.onCompleted();
        System.out.println("User delete");
    }
}
