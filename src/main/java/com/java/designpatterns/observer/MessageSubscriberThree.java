package com.java.designpatterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Pulipati Venkata UdayKiran
 * @since 31-Aug 2021 17:57
 */
public class MessageSubscriberThree implements Observer {

    private static Logger LOG = LoggerFactory.getLogger(MessageSubscriberThree.class);

    @Override
    public void update(Message message) {
        LOG.info("MessageSubscriberThree:: {}", message.getMessageContent());
    }

}
