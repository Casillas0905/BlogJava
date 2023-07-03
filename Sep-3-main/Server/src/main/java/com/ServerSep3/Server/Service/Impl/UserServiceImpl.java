package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Repository.UserRepository;
import com.ServerSep3.Server.Service.MatchService;
import com.ServerSep3.Server.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    MatchService matchService;



    @Override
    public List<UserModel> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserModel findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public UserModel saveUser(UserModel user) {
        UserModel userModel=userRepository.save(user);
        matchService.CreateMatchForUser(user);
        return userModel;
    }

    @Override
    public UserModel updateUser(UserModel userModel) {
        UserModel existing= userRepository.findById(userModel.getId());
        existing.setDescription(userModel.getDescription());
        existing.setNote(userModel.getNote());
        existing.setPhoto1(userModel.getPhoto1());
        existing.setPhoto2(userModel.getPhoto2());
        existing.setPhoto3(userModel.getPhoto3());
        existing.setPhoto4(userModel.getPhoto4());
        existing.setPhoto5(userModel.getPhoto5());
        existing.setOccupation(userModel.getOccupation());
        existing.setEducation(userModel.getEducation());
        existing.setCity(userModel.getCity());
        existing.setDrink(userModel.isDrink());
        return userRepository.save(existing);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserModel findByUsername(String username) {
        UserModel userModel= userRepository.findByUsername(username);
        if (userModel == null) {
            return null;
        }
        return userModel;
    }

    @Override
    public List<UserModel> findByGender(String gender) {
        return userRepository.findByGender(gender);
    }
}
