package com.java.designpatterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author Pulipati Venkata UdayKiran
 * @since 31-Aug 2021 17:49
 */
public class MessageSubscriberOne implements Observer {

    private static Logger LOG = LoggerFactory.getLogger(MessageSubscriberOne.class);

    @Override
    public void update(Message message) {
        LOG.info("MessageSubscriberOne:: {}", message.getMessageContent());
    }
    
}
