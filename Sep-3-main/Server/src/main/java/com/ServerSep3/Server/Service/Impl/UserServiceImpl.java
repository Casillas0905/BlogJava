package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Repository.UserRepository;
import com.ServerSep3.Server.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserModel findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public UserModel saveUser(UserModel user) {
        if(isEmailUse(user.getEmail())){
            return null;
        }
        UserModel userModel=userRepository.save(user);
        return userModel;
    }

    @Override
    public UserModel updateUser(UserModel userModel) {
        UserModel existing= userRepository.findById(userModel.getId());
        /*if(isEmailUse(userModel.getEmail())){
            throw new Exception("Email is already in use");
        }*/
        existing.setFirstname(userModel.getFirstname());
        existing.setLastName(userModel.getLastName());
        existing.setBirthday(userModel.getBirthday());
        existing.setEmail(userModel.getEmail());
        return userRepository.save(existing);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserModel findByEmail(String email) {
        UserModel userModel= userRepository.findByEmail(email);
        if (userModel == null) {
            return null;
        }
        return userModel;
    }

    public boolean isEmailUse(String email){
        UserModel userModel= userRepository.findByEmail(email);
        if (userModel == null) {
            return false;
        }
        return true;
    }
}
