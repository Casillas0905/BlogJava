package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.EventModel;
import com.ServerSep3.Server.Repository.EventRepository;
import com.ServerSep3.Server.Service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsServiceImpl  {

    /*private final EventRepository eventRepository;

    public EventsServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<EventModel> findAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public EventModel findById(int id) {
        return eventRepository.findById(id);
    }

    @Override
    public EventModel saveEvent(EventModel eventModel) {
        return eventRepository.save(eventModel);
    }

    @Override
    public EventModel updateEvent(EventModel eventModel) {
        EventModel existing= eventRepository.findById(eventModel.getId());
        existing.setDescription(eventModel.getDescription());
        existing.setTitle(eventModel.getTitle());
        return eventRepository.save(eventModel);
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }*/
}
