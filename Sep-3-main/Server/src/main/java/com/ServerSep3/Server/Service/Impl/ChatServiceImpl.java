package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.ChatModel;
import com.ServerSep3.Server.Repository.ChatRepository;
import com.ServerSep3.Server.Service.ChatService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    private final ChatRepository chatRepository;

    public ChatServiceImpl(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    @Override
    public ChatModel findById(int id) {
        return chatRepository.findById(id);
    }

    @Override
    public ChatModel saveChat(ChatModel chatModel) {
        return chatRepository.save(chatModel);
    }

    @Override
    public void deleteChat(Long id) {
        chatRepository.deleteById(id);
    }

    @Override
    public List<ChatModel> findByUserId(int id) {
        List<ChatModel> list1=chatRepository.findByUserId1(id);
        List<ChatModel> list2=chatRepository.findByUserId2(id);
        List<ChatModel> resultList = new ArrayList<>();
        resultList.addAll(list1);
        resultList.addAll(list2);
        return resultList;
    }
}
