package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.LikeModel;
import com.ServerSep3.Server.Repository.CommentRepository;
import com.ServerSep3.Server.Repository.LikeRepository;
import com.ServerSep3.Server.Service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeServiceImpl implements LikeService {
    @Autowired
    LikeRepository likeRepository;
    @Override
    public void saveLike(LikeModel likeModel) {
        likeRepository.save(likeModel);
    }

    @Override
    public void deleteLikeById(int id) {
        likeRepository.deleteById(id);
    }
    @Override
    public LikeModel findByPostLikedAndUserLiking(int PostId, int Userid) {
        return likeRepository.findByPostLikedAndUserLiking(PostId, Userid);
    }
}
