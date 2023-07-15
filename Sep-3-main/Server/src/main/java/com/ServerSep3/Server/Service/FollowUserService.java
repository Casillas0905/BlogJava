package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.FollowUserModel;

import java.util.List;

public interface FollowUserService {
    List<FollowUserModel> findByUserFollowingId(int id);
    void saveFollow(FollowUserModel followUserModel);
}
