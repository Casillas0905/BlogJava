package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.LikeModel;
import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<LikeModel,Long> {
    LikeModel findById(int id);
    LikeModel findByPostLiked(int id);
}
