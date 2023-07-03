package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.EventModel;
import com.ServerSep3.Server.Model.UserModel;

import java.util.List;

public interface EventService {
    List<EventModel> findAllEvents();
    EventModel findById(int id);
    EventModel saveEvent(EventModel eventModel);
    EventModel updateEvent(EventModel eventModel);
    void deleteEvent(Long id);
}
