package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.FollowCategoryModel;

import java.util.List;

public interface FollowCategoryService {
    List<FollowCategoryModel> findByUserFollowing(int userId);
    void deleteById(int id);
    void saveFollowCategory(FollowCategoryModel followCategoryModel);
}
