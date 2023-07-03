package com.ServerSep3.Server.Controller;

import com.ServerSep3.Server.Model.EventModel;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }


    @GetMapping
    public List<EventModel> findAllEvents() {
        return eventService.findAllEvents();
    }

    @GetMapping("/id/{id}")
    public EventModel findById(@PathVariable("id")int id) {
        return eventService.findById(id);
    }

    @PostMapping("/save")
    public EventModel saveEvent(@RequestBody EventModel event) {
        return eventService.saveEvent(event);
    }

    @PostMapping("/update")
    public EventModel updateEvent(@RequestBody EventModel event){return eventService.updateEvent(event);}

    @GetMapping("/delete/{id}")
    public void deleteEvent(@PathVariable("id")long id){eventService.deleteEvent(id);}

}
