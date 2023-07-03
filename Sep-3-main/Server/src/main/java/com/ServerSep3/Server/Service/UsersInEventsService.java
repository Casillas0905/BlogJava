package com.ServerSep3.Server.Service;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Model.UsersInEvents;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UsersInEventsService {
    List<UserModel> findAllUserForOneEvent(int id);
    UsersInEvents saveUserInEvent(UsersInEvents usersInEvents);
    void deleteUser(UsersInEvents usersInEvents);
}
