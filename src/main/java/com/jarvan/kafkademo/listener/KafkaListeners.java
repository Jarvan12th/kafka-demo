package com.jarvan.kafkademo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "test" , groupId = "group_id")
    void listener(String data) {
        System.out.println("Listener Received: " + data + "!");
    }
}
