package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Model.UsersInEvents;
import com.ServerSep3.Server.Repository.UsersInEventRepository;
import com.ServerSep3.Server.Service.UsersInEventsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersInEventsImpl  {

   /* private final UsersInEventRepository usersInEventRepository;

    public UsersInEventsImpl(UsersInEventRepository usersInEventRepository) {
        this.usersInEventRepository = usersInEventRepository;
    }

    @Override
    public List<UserModel> findAllUserForOneEvent(int id) {
        return usersInEventRepository.findByEventId(id);
    }

    @Override
    public UsersInEvents saveUserInEvent(UsersInEvents usersInEvents) {
        return usersInEventRepository.save(usersInEvents);
    }

    @Override
    public void deleteUser(UsersInEvents usersInEvents) {
        usersInEventRepository.delete(usersInEvents);
    }*/
}
