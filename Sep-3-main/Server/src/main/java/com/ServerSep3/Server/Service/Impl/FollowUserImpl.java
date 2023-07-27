package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.FollowUserModel;
import com.ServerSep3.Server.Repository.CommentRepository;
import com.ServerSep3.Server.Repository.FollowUserRepository;
import com.ServerSep3.Server.Service.FollowUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowUserImpl implements FollowUserService {
    @Autowired
    FollowUserRepository followUserRepository;
    @Override
    public List<FollowUserModel> findByUserFollowingId(int followedUserId, int followingUserId) {
        return followUserRepository.findByUserFollowingAndAndUserFollowed(followedUserId,followingUserId);
    }

    @Override
    public void saveFollowUser(FollowUserModel followUserModel) {
        followUserRepository.save(followUserModel);
    }

    @Override
    public void deleteById(int id) {
        followUserRepository.deleteById(id);
    }
}
