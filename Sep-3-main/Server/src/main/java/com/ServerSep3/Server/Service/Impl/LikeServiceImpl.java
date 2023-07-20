package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Repository.CommentRepository;
import com.ServerSep3.Server.Service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeServiceImpl implements LikeService {


    @Override
    public void saveLike(LikeService likeService) {

    }

    @Override
    public boolean isPostLike(int PostId, int Userid) {
        return false;
    }
}
