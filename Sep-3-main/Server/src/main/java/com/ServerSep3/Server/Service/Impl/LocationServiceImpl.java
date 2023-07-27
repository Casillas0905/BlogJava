package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.LocationModel;
import com.ServerSep3.Server.Repository.CommentRepository;
import com.ServerSep3.Server.Repository.LocationRepository;
import com.ServerSep3.Server.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepository locationRepository;
    @Override
    public LocationModel findById(int id) {
        return locationRepository.findById(id);
    }

    @Override
    public List<LocationModel> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public void save(LocationModel locationModel) {
        locationRepository.save(locationModel);
    }
}
