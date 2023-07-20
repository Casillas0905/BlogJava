package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.CommentModel;
import com.ServerSep3.Server.Repository.CommentRepository;
import com.ServerSep3.Server.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Override
    public List<CommentModel> findByPostId(int id) {
        return commentRepository.findByPost(id);
    }

    @Override
    public void saveComment(CommentModel commentModel) {
        commentRepository.save(commentModel);
    }
}
