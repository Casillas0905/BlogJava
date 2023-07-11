package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostModel,Long> {
    List<PostModel> findByCategory(String category);
    List<PostModel> findByLocation(String category);
    List<PostModel> findByTitle(String category);
    PostModel findById(int id);
    List<PostModel> findByUserId(int id);
}
