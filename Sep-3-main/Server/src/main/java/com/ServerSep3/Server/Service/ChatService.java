package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.ChatModel;
import com.ServerSep3.Server.Model.MatchModel;

import java.util.List;

public interface ChatService {
    ChatModel findById(int id);
    ChatModel saveChat(ChatModel chatModel);
    void deleteChat(Long id);
    List<ChatModel> findByUserId(int id);
}
