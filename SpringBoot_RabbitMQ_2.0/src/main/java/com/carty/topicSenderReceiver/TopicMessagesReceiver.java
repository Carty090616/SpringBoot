package com.carty.topicSenderReceiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class TopicMessagesReceiver {
	@RabbitHandler
    public void process(String msg) {
        System.out.println("topicMessageReceiver(s)  : " +msg);
    }
}
