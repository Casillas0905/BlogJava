package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.CommentModel;

import java.util.List;

public interface CommentService {
    List<CommentService> findByPostId(int id);
    void saveComment(CommentModel commentModel);
}
