package com.java.designpatterns.observer;
/**
 * @author Pulipati Venkata UdayKiran
 * @since 31-Aug 2021 17:41
 * 
 * This must be an immutable object so that no class can modify it’s content by mistake.
 */
public class Message {
    final String messageContent;
     
    public Message (String m) {
        this.messageContent = m;
    }
 
    public String getMessageContent() {
        return messageContent;
    }
}
