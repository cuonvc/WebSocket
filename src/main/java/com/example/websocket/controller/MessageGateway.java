package com.example.websocket.controller;

import com.example.websocket.pub.MessagePush;
import com.example.websocket.sub.MessageReceive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

@RestController
@Slf4j
public class MessageGateway {

    @MessageMapping("/demo")  //destination path
    @SendTo("/topic/test")  //subscribe to 'test' topic
    public MessagePush handle(MessageReceive messageReceive) throws Exception {
        log.info("checkkkkkk - {}", messageReceive);
        return new MessagePush("I received the message: " + messageReceive.getMessage());
    }
}
