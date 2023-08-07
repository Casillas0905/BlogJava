package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Category.Category;
import GrpcClasses.Comment.Comment;
import GrpcClasses.Location.Location;
import GrpcClasses.Location.LocationGrpcGrpc;
import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.LocationModel;
import com.ServerSep3.Server.Service.CategoryService;
import com.ServerSep3.Server.Service.LocationService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@GRpcService
public class LocationGrpcImpl extends LocationGrpcGrpc.LocationGrpcImplBase {

    @Autowired
    LocationService locationService;

    public LocationGrpcImpl() {
    }

    @Override
    public void saveLocation(Location.LocationModelGrpc request, StreamObserver<Location.Empty> responseObserver) {
        locationService.save(new LocationModel(request.getLocation(), request.getId()));
        Location.Empty empty = Location.Empty.newBuilder().build();
        responseObserver.onNext(empty);
        responseObserver.onCompleted();
    }

    @Override
    public void findAll(Location.Empty request, StreamObserver<Location.LocationModelGrpc> responseObserver) {
        List<LocationModel> list= locationService.findAll();
        List<Location.LocationModelGrpc> listGrpc= new ArrayList<>();
        for (int i=0;i< list.size();i++){
            Location.LocationModelGrpc post= Location.LocationModelGrpc.newBuilder()
                    .setLocation(list.get(i).getLocation())
                    .setId(list.get(i).getId())
                    .build();
            listGrpc.add(post);
        }
        for(Location.LocationModelGrpc locationModelGrpc : listGrpc){
            responseObserver.onNext(locationModelGrpc);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void findById(Location.GetById request, StreamObserver<Location.LocationModelGrpc> responseObserver) {
        LocationModel model=locationService.findById(request.getId());
        if (model == null){
            Location.LocationModelGrpc response= Location.LocationModelGrpc.newBuilder()
                    .setLocation("niull")
                    .setId(0)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        else {
            Location.LocationModelGrpc response= Location.LocationModelGrpc.newBuilder()
                    .setLocation(model.getLocation())
                    .setId(model.getId())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
