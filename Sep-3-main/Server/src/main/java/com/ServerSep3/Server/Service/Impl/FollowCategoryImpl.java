package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.FollowCategoryModel;
import com.ServerSep3.Server.Repository.FollowCategoryRepository;
import com.ServerSep3.Server.Service.FollowCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowCategoryImpl implements FollowCategoryService {
    @Autowired
    FollowCategoryRepository followCategoryRepository;
    @Override
    public List<FollowCategoryModel> findByUserFollowing(int userId) {
        return followCategoryRepository.findByUserFollowing(userId);
    }

    @Override
    public void deleteById(int id) {
        followCategoryRepository.deleteById(id);
    }

    @Override
    public void saveFollowCategory(FollowCategoryModel followCategoryModel) {
        followCategoryRepository.save(followCategoryModel);
    }
}
