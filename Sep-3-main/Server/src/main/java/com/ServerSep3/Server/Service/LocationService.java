package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.LocationModel;

import java.util.List;

public interface LocationService {
    LocationModel findById(int id);
    List<LocationModel> findAll();
    void save(LocationModel locationModel);
}
