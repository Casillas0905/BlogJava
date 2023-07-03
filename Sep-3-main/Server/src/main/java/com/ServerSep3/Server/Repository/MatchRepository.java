package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.ChatModel;
import com.ServerSep3.Server.Model.MatchModel;
import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRepository extends JpaRepository<MatchModel,Long> {
    MatchModel findById(int id);
    List<MatchModel> findByUserId1(int id);
    List<MatchModel> findByUserId2(int id);
}
