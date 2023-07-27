package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.SaveModel;

import java.util.List;

public interface SaveService {
    List<SaveModel> findByUserId(int userId);
    void saveSave(SaveModel saveModel);
    void deleteSaveById(int id);
}
