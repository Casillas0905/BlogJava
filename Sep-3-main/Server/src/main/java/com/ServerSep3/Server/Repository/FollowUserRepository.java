package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.FollowUserModel;
import com.ServerSep3.Server.Model.LikeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FollowUserRepository extends JpaRepository<FollowUserModel,Long> {
    List<FollowUserModel> findByUserFollowingAndAndUserFollowed(int followedUserId, int followingUserId);
    void deleteById(int id);
}
