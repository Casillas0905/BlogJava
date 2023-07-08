package com.ServerSep3.Server.Controller;


import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Model.UsersInEvents;
import com.ServerSep3.Server.Service.UsersInEventsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usersInEvents")
public class UsersInEvent {

    /*private final UsersInEventsService usersInEventsService;

    public UsersInEvent(UsersInEventsService usersInEventsService) {
        this.usersInEventsService = usersInEventsService;
    }

    @GetMapping("/findAll/{id}")
    public List<UserModel> findAllUserForOneEvent(@PathVariable("id")int id){
        return usersInEventsService.findAllUserForOneEvent(id);
    }

    @PostMapping("/save")
    public UsersInEvents save(@RequestBody UsersInEvents usersInEvents){
        return usersInEventsService.saveUserInEvent(usersInEvents);
    }

    @GetMapping("/delete/{id}")
    public void deleteUserFromEvent(@PathVariable("id") UsersInEvents usersInEvents){
        usersInEventsService.deleteUser(usersInEvents);
    }*/
}
