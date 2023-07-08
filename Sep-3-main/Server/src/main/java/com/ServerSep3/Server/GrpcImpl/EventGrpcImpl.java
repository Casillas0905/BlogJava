package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Event.Event;
import GrpcClasses.Event.EventsGrpc;
import com.ServerSep3.Server.Model.EventModel;
import com.ServerSep3.Server.Service.EventService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class EventGrpcImpl extends EventsGrpc.EventsImplBase {


    /*@Autowired
    EventService service;


    @Override
    public void findAllEvents(Event.Empty request, StreamObserver<Event.EventModel> responseObserver) {
        System.out.println("Find all evnts");
        List<EventModel> events= service.findAllEvents();
        for (int i=0; i<events.size();i++){
            Event.EventModel reponse= Event.EventModel.newBuilder()
                    .setDescription(events.get(i).getDescription())
                    .setTitle(events.get(i).getTitle())
                    .setId(events.get(i).getId())
                    .setMadeById(events.get(i).getMadeById())
                    .build();
            responseObserver.onNext(reponse);
        }
        responseObserver.onCompleted();
        System.out.println("all events found");
    }

    @Override
    public void findById(Event.EventIdRequest request, StreamObserver<Event.EventModel> responseObserver) {
        System.out.println("find by id");
        EventModel eventModel=service.findById(request.getId());
        Event.EventModel reponse= Event.EventModel.newBuilder()
                .setDescription(eventModel.getDescription())
                .setTitle(eventModel.getTitle())
                .setId(eventModel.getId())
                .setMadeById(eventModel.getMadeById())
                .build();
        responseObserver.onNext(reponse);
        responseObserver.onCompleted();
        System.out.println("Event returned");
    }

    @Override
    public void saveEvent(Event.EventModel request, StreamObserver<Event.Empty> responseObserver) {
        System.out.println("Save event");
        service.saveEvent(new EventModel(request.getId(),request.getDescription(), request.getTitle(), request.getMadeById()));
        responseObserver.onCompleted();
        System.out.println("Event save");
    }

    @Override
    public void updateEvent(Event.EventModel request, StreamObserver<Event.Empty> responseObserver) {
        System.out.println("Update event");
        service.updateEvent(new EventModel(request.getId(),request.getDescription(), request.getTitle(), request.getMadeById()));
        responseObserver.onCompleted();
        System.out.println("Event updates");
    }

    @Override
    public void deleteEvent(Event.EventIdRequest request, StreamObserver<Event.Empty> responseObserver) {
        System.out.println("Delete event");
        service.deleteEvent((long) request.getId());
        responseObserver.onCompleted();
        System.out.println("Event updates");
    }*/
}
