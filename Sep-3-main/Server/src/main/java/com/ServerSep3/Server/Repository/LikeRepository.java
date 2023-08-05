package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.LikeModel;
import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository extends JpaRepository<LikeModel,Long> {
    LikeModel findByPostLikedAndUserLiking(int PostId,int Userid);
    void deleteByPostLikedAndUserLiking(int PostId,int Userid);
    List<LikeModel> findByPostLiked(int postId);
}
