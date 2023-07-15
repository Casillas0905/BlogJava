package com.ServerSep3.Server.Service;

public interface LikeService {
    void saveLike(LikeService likeService);
    boolean isPostLike(int PostId,int Userid);
}
