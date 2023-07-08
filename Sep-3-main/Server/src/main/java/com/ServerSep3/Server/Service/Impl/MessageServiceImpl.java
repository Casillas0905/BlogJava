package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.MessageModel;
import com.ServerSep3.Server.Repository.MessageRepository;
import com.ServerSep3.Server.Service.MessageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl  {

    /*private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<MessageModel> findAllMessagesForAChat(int id) {
        return messageRepository.findByChatId(id);
    }

    @Override
    public MessageModel findById(int id) {
        return messageRepository.findById(id);
    }

    @Override
    public MessageModel saveMessage(MessageModel messageModel) {
        return messageRepository.save(messageModel);
    }

    @Override
    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }*/
}
