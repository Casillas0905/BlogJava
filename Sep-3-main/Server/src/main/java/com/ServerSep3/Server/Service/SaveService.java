package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.SaveModel;

import java.util.List;

public interface SaveService {
    List<SaveService> findByUserId(int userId);
    void saveSave(SaveModel saveModel);
}
