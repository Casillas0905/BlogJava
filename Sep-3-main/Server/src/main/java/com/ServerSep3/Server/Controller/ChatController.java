package com.ServerSep3.Server.Controller;

import com.ServerSep3.Server.Model.ChatModel;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.ChatService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/{id}")
    public ChatModel findById(@PathVariable("id")int id) {
        return chatService.findById(id);
    }

    @PostMapping("/save")
    public ChatModel saveChat(@RequestBody ChatModel chatModel){
        return chatService.saveChat(chatModel);
    }

    @GetMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id")long id){
        chatService.deleteChat(id);
    }

    @GetMapping("/getUser/{id}")
    public List<ChatModel> findByUserId1(@PathVariable("id")int id){
        return chatService.findByUserId(id);
    }
}
