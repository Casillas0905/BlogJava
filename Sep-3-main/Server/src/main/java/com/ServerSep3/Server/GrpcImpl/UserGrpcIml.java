package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.User.User;
import GrpcClasses.User.UserGrpcGrpc;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.UserService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@GRpcService
public class UserGrpcIml extends UserGrpcGrpc.UserGrpcImplBase {

    @Autowired
    UserService userService;

    public UserGrpcIml() {
    }

    @Override
    public void saveUser(User.UserModelGrpc request, StreamObserver<User.Empty> responseObserver) {
        System.out.println("Save user");
        Date date=new Date(request.getDate().getYear(),request.getDate().getMonth(), request.getDate().getDay());
        UserModel userModel= new UserModel(request.getId(),
                request.getFirstName(),
                request.getPassword(),
                request.getEmail(),
                request.getLastName(),
                date,
                request.getAdministrator());
        userService.saveUser(userModel);
        responseObserver.onCompleted();
    }

    @Override
    public void findById(User.GetById request, StreamObserver<User.UserModelGrpc> responseObserver) {
        UserModel model=userService.findById(request.getId());
        if (model == null){
            System.out.println("its null");
            User.DateGrpc date= User.DateGrpc.newBuilder().setDay(0).setMonth(0).setYear(0).build();
            User.UserModelGrpc response= User.UserModelGrpc.newBuilder()
                    .setFirstName("niull")
                    .setId(0)
                    .setPassword("niull")
                    .setEmail("niull")
                    .setLastName("niull")
                    .setDate(date)
                    .setAdministrator(false)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        else {
            User.DateGrpc date= User.DateGrpc.newBuilder().setDay(model.getBirthday().getDay()).setYear(model.getBirthday().getYear()).setMonth(model.getBirthday().getMonth()).build();
            User.UserModelGrpc response= User.UserModelGrpc.newBuilder()
                    .setFirstName(model.getFirstname())
                    .setId(model.getId())
                    .setPassword(model.getPassword())
                    .setEmail(model.getEmail())
                    .setLastName(model.getLastName())
                    .setDate(date)
                    .setAdministrator(model.isAdministrator())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }


    @Override
    public void updateUser(User.UserModelGrpc request, StreamObserver<User.Empty> responseObserver) throws Exception {
        System.out.println("Update user");
        Date date=new Date(request.getDate().getYear(),request.getDate().getMonth(), request.getDate().getDay());
        userService.updateUser(new UserModel(request.getId(),
                request.getFirstName(),
                request.getPassword(),
                request.getEmail(),
                request.getLastName(),
                date,
                request.getAdministrator()));
        responseObserver.onCompleted();
        System.out.println("User updated");
    }



    @Override
    public void findByEmail(User.GetByEmail request, StreamObserver<User.UserModelGrpc> responseObserver) {
        UserModel model=userService.findByEmail(request.getEmail());
        if (model == null){
            System.out.println("its null");
            User.DateGrpc date= User.DateGrpc.newBuilder().setDay(0).setMonth(0).setYear(0).build();
            User.UserModelGrpc response= User.UserModelGrpc.newBuilder()
                    .setFirstName("niull")
                    .setId(0)
                    .setPassword("niull")
                    .setEmail("niull")
                    .setLastName("niull")
                    .setDate(date)
                    .setAdministrator(false)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        else {
            User.DateGrpc date= User.DateGrpc.newBuilder().setDay(model.getBirthday().getDay()).setYear(model.getBirthday().getYear()).setMonth(model.getBirthday().getMonth()).build();
            User.UserModelGrpc response= User.UserModelGrpc.newBuilder()
                    .setFirstName(model.getFirstname())
                    .setId(model.getId())
                    .setPassword(model.getPassword())
                    .setEmail(model.getEmail())
                    .setLastName(model.getLastName())
                    .setDate(date)
                    .setAdministrator(model.isAdministrator())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteUser(User.GetById request, StreamObserver<User.Empty> responseObserver) {
        System.out.println("Delete user");
        userService.deleteUser((long) request.getId());
        responseObserver.onCompleted();
        System.out.println("User delete");
    }
    }

