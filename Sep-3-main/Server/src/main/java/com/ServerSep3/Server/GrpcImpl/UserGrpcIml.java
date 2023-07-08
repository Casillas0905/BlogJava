package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.User.User;
import GrpcClasses.User.UserGrpcGrpc;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.UserService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@GRpcService
public class UserGrpcIml extends UserGrpcGrpc.UserGrpcImplBase {

    /*@Autowired
    UserService userService;

    public UserGrpcIml() {
    }

    @Override
    public void saveUser(User.UserModel request, StreamObserver<User.Empty> responseObserver) {
        System.out.println("Save user");
        UserModel userModel= new UserModel(request.getId(),request.getUsername(),request.getPassword(),request.getEmail(),request.getFirstName(),request.getLastName(), request.getBirthday(), request.getDescription(), request.getNumberOfMatches(),request.getNote(), request.getPhoto1(), request.getPhoto2(), request.getPhoto3(), request.getPhoto4(), request.getPhoto5(), request.getGender(), request.getPreference(), request.getHoroscope(), request.getOccupation(), request.getCity(), request.getEducation(), request.getDrink(), request.getAdministrator());
        userService.saveUser(userModel);
        responseObserver.onCompleted();
    }

    @Override
    public void findById(User.GetById request, StreamObserver<User.UserModel> responseObserver) {
        UserModel model=userService.findById(request.getId());
        if (model == null){
            System.out.println("its null");
            User.UserModel response2= User.UserModel.newBuilder()
                    .setFirstName("niull")
                    .setId(0)
                    .setUsername("niull")
                    .setPassword("niull")
                    .setEmail("niull")
                    .setLastName("niull")
                    .setBirthday("niull")
                    .setDescription("niull")
                    .setNumberOfMatches(0)
                    .setNote("niull")
                    .setPhoto1("niull")
                    .setPhoto2("niull")
                    .setPhoto3("niull")
                    .setPhoto4("niull")
                    .setPhoto5("niull")
                    .setGender("niull")
                    .setPreference("niull")
                    .setHoroscope("niull")
                    .setOccupation("niull")
                    .setCity("niull")
                    .setEducation("niull")
                    .setDrink(true)
                    .setAdministrator(false)
                    .build();
            System.out.println(response2.getUsername());
            responseObserver.onNext(response2);
            responseObserver.onCompleted();
        }
        else {
            System.out.println("metido");
            User.UserModel response= User.UserModel.newBuilder()
                    .setFirstName(model.getFirstName())
                    .setId(model.getId())
                    .setUsername(model.getUsername())
                    .setPassword(model.getPassword())
                    .setEmail(model.getEmail())
                    .setLastName(model.getLastName())
                    .setBirthday(model.getBirthday())
                    .setDescription(model.getDescription())
                    .setNumberOfMatches(model.getNumber_of_matches())
                    .setNote(model.getNote())
                    .setPhoto1(model.getPhoto1())
                    .setPhoto2(model.getPhoto2())
                    .setPhoto3(model.getPhoto3())
                    .setPhoto4(model.getPhoto4())
                    .setPhoto5(model.getPhoto5())
                    .setGender(model.getGender())
                    .setPreference(model.getPreference())
                    .setHoroscope(model.getHoroscope())
                    .setOccupation(model.getOccupation())
                    .setCity(model.getCity())
                    .setEducation(model.getEducation())
                    .setDrink(model.isDrink())
                    .setAdministrator(model.isAdministrator())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
    }
    }

    @Override
    public void findAll(User.Empty request, StreamObserver<User.UserModel> responseObserver) {
        System.out.println("Find all");
        List<UserModel> list= userService.findAllUsers();
        List<User.UserModel> listGrpc= new ArrayList<>();
        for (int i=0;i< list.size();i++){
            User.UserModel userModel= User.UserModel.newBuilder()
                    .setFirstName(list.get(i).getFirstName())
                    .setId(list.get(i).getId())
                    .setUsername(list.get(i).getUsername())
                    .setPassword(list.get(i).getPassword())
                    .setEmail(list.get(i).getEmail())
                    .setLastName(list.get(i).getLastName())
                    .setBirthday(list.get(i).getBirthday())
                    .setDescription(list.get(i).getDescription())
                    .setNumberOfMatches(list.get(i).getNumber_of_matches())
                    .setNote(list.get(i).getNote())
                    .setPhoto1(list.get(i).getPhoto1())
                    .setPhoto2(list.get(i).getPhoto2())
                    .setPhoto3(list.get(i).getPhoto3())
                    .setPhoto4(list.get(i).getPhoto4())
                    .setPhoto5(list.get(i).getPhoto5())
                    .setGender(list.get(i).getGender())
                    .setPreference(list.get(i).getPreference())
                    .setHoroscope(list.get(i).getHoroscope())
                    .setOccupation(list.get(i).getOccupation())
                    .setCity(list.get(i).getCity())
                    .setEducation(list.get(i).getEducation())
                    .setDrink(list.get(i).isDrink())
                    .setAdministrator(list.get(i).isAdministrator())
                    .build();
            listGrpc.add(userModel);
        }
        for (User.UserModel userModel : listGrpc) {
            responseObserver.onNext(userModel);
        }
        responseObserver.onCompleted();
        System.out.println("Users send");
    }

    @Override
    public void updateUser(User.UserModel request, StreamObserver<User.Empty> responseObserver) {
        System.out.println("Update user");
        userService.updateUser(new UserModel(request.getId(),request.getUsername(),request.getPassword(),request.getEmail(),request.getFirstName(),request.getLastName(), request.getBirthday(), request.getDescription(), request.getNumberOfMatches(),request.getNote(), request.getPhoto1(), request.getPhoto2(), request.getPhoto3(), request.getPhoto4(), request.getPhoto5(), request.getGender(), request.getPreference(), request.getHoroscope(), request.getOccupation(), request.getCity(), request.getEducation(), request.getDrink(), request.getAdministrator()));
        responseObserver.onCompleted();
        System.out.println("User updated");
    }

    @Override
    public void deleteUser(User.GetById request, StreamObserver<User.Empty> responseObserver) {
        System.out.println("Delete user");
        userService.deleteUser((long) request.getId());
        responseObserver.onCompleted();
        System.out.println("User delete");
    }

    @Override
    public void findByUsername(User.GetByUsername request, StreamObserver<User.UserModel> responseObserver) {
        System.out.println("Find By Username");
        UserModel model=userService.findByEmail(request.getUsername());
        if (model == null){
            System.out.println("its null");
            User.UserModel response2= User.UserModel.newBuilder()
            .setFirstName("niull")
                    .setId(0)
                    .setUsername("niull")
                    .setPassword("niull")
                    .setEmail("niull")
                    .setLastName("niull")
                    .setBirthday("niull")
                    .setDescription("niull")
                    .setNumberOfMatches(0)
                    .setNote("niull")
                    .setPhoto1("niull")
                    .setPhoto2("niull")
                    .setPhoto3("niull")
                    .setPhoto4("niull")
                    .setPhoto5("niull")
                    .setGender("niull")
                    .setPreference("niull")
                    .setHoroscope("niull")
                    .setOccupation("niull")
                    .setCity("niull")
                    .setEducation("niull")
                    .setDrink(true)
                    .setAdministrator(false)
                            .build();
            System.out.println(response2.getUsername());
            responseObserver.onNext(response2);
            responseObserver.onCompleted();
        }
        else {
            System.out.println("metido");
        User.UserModel response= User.UserModel.newBuilder()
                    .setFirstName(model.getFirstName())
                    .setId(model.getId())
                    .setUsername(model.getUsername())
                    .setPassword(model.getPassword())
                    .setEmail(model.getEmail())
                    .setLastName(model.getLastName())
                    .setBirthday(model.getBirthday())
                    .setDescription(model.getDescription())
                    .setNumberOfMatches(model.getNumber_of_matches())
                    .setNote(model.getNote())
                    .setPhoto1(model.getPhoto1())
                    .setPhoto2(model.getPhoto2())
                    .setPhoto3(model.getPhoto3())
                    .setPhoto4(model.getPhoto4())
                    .setPhoto5(model.getPhoto5())
                    .setGender(model.getGender())
                    .setPreference(model.getPreference())
                    .setHoroscope(model.getHoroscope())
                    .setOccupation(model.getOccupation())
                    .setCity(model.getCity())
                    .setEducation(model.getEducation())
                    .setDrink(model.isDrink())
                    .setAdministrator(model.isAdministrator())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        }*/
    }

