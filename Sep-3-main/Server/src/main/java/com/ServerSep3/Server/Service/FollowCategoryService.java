package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.FollowCategoryModel;
import com.ServerSep3.Server.Model.FollowUserModel;

import java.util.List;

public interface FollowCategoryService {
    List<FollowCategoryModel> findByCategoryFollowingId(int id);
    void saveFollow(FollowCategoryModel followCategoryModel);
}
