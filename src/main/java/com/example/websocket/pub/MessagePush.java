package com.example.websocket.pub;

public class MessagePush {

    private String content;

    public MessagePush(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
