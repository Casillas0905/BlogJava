package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.LikeModel;

public interface LikeService {
    void saveLike(LikeModel likeModel);
    void deleteLikeById(int id);
    boolean findByPostLikedAndUserLiking(int PostId, int Userid);
    int findLikesByPostLiked(int postId);
}
