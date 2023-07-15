package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.FollowCategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FollowRepository extends JpaRepository<FollowCategoryModel,Long> {
    FollowCategoryModel findById(int id);
    List<FollowCategoryModel> findByUserFollowing(int id);
}
