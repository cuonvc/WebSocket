package com.example.websocket.controller;

import com.example.websocket.pub.MessagePush;
import com.example.websocket.sub.MessageReceive;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

@RestController
public class MessageGateway {

    @MessageMapping("/demo")  //destination path
    @SendTo("/topic/test")  //subscribe to 'test' topic
    public MessagePush handle(MessageReceive messageReceive) throws Exception {
        return new MessagePush("I received the message: '" + messageReceive.getMessage() + "'");
    }
}
