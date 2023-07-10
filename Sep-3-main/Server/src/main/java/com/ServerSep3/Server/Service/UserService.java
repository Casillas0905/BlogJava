package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.UserModel;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    UserModel findById(int id);
    UserModel saveUser(UserModel userModel);
    UserModel updateUser(UserModel userModel) ;
    void deleteUser(Long id);
    UserModel findByEmail(String email);
}
