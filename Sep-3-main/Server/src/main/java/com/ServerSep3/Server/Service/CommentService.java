package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.CommentModel;

import java.util.List;

public interface CommentService {
    List<CommentModel> findByPostId(int id);
    void saveComment(CommentModel commentModel);
}
