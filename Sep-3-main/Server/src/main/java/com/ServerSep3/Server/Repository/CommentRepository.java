package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.CommentModel;
import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentModel,Long> {
    CommentModel findById(int id);
    List<CommentModel> findByPost(int postId);
}
