package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.LikeModel;
import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<LikeModel,Long> {
    boolean findByPostLikedAndUserLiking(int PostId,int Userid);
    void deleteById(int id);
    int findByPostLiked(int postId);
}
