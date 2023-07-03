package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.MessageModel;

import java.util.List;

public interface MessageService {
    List<MessageModel> findAllMessagesForAChat(int id);
    MessageModel findById(int id);
    MessageModel saveMessage(MessageModel messageModel);
    void deleteMessage(Long id);
}
