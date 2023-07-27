package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.SaveModel;
import com.ServerSep3.Server.Repository.SaveRepository;
import com.ServerSep3.Server.Service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaveServiceImpl implements SaveService {
    @Autowired
    SaveRepository saveRepository;
    @Override
    public List<SaveModel> findByUserId(int userId) {
        return saveRepository.findByUserId(userId);
    }

    @Override
    public void saveSave(SaveModel saveModel) {
        saveRepository.save(saveModel);
    }

    @Override
    public void deleteSaveById(int id) {
        saveRepository.deleteById(id);
    }
}
