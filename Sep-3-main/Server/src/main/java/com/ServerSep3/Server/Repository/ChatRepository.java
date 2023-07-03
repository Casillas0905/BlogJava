package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.ChatModel;
import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatRepository extends JpaRepository<ChatModel,Long> {
    ChatModel findById(int id);
    List<ChatModel> findByUserId1(int id);
    List<ChatModel> findByUserId2(int id);
}
