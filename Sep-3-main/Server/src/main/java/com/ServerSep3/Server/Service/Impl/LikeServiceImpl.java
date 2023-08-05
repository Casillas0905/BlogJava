package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.LikeModel;
import com.ServerSep3.Server.Repository.CommentRepository;
import com.ServerSep3.Server.Repository.LikeRepository;
import com.ServerSep3.Server.Service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LikeServiceImpl implements LikeService {
    @Autowired
    LikeRepository likeRepository;
    @Override
    public void saveLike(LikeModel likeModel) {
        likeRepository.save(likeModel);
    }

    @Override
    public void deleteLikeByPostLikedAndUserLiking(int PostId, int Userid) {
        likeRepository.deleteByPostLikedAndUserLiking(PostId,Userid);
    }
    @Override
    public boolean findByPostLikedAndUserLiking(int PostId, int Userid) {
        LikeModel likeModel=likeRepository.findByPostLikedAndUserLiking(PostId, Userid);
        if(likeModel== null){
            return false;
        }
        return true;
    }

    @Override
    public int findLikesByPostLiked(int postId) {
        ArrayList<LikeModel> list= (ArrayList<LikeModel>) likeRepository.findByPostLiked(postId);
        return list.size();
    }


}
