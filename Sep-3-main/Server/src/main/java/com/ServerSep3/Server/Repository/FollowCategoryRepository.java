package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.FollowCategoryModel;
import com.ServerSep3.Server.Model.LikeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FollowCategoryRepository extends JpaRepository<FollowCategoryModel,Long> {
    List<FollowCategoryModel> findByUserFollowing(int userId);
    void deleteById(int id);
}
