package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<MessageModel,Long> {
    MessageModel findById(int id);
    List<MessageModel> findByChatId(int id);
}
