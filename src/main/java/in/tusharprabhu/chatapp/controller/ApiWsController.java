package in.tusharprabhu.chatapp.controller;

import in.tusharprabhu.chatapp.model.ChatMessage;
import in.tusharprabhu.chatapp.model.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiWsController {
    @Autowired
    private SimpMessagingTemplate template;
    @PostMapping("/api/send")
    public Info send(@RequestBody Info request){
    template.convertAndSend("/topic/public", request);
    return request;
    }
}
