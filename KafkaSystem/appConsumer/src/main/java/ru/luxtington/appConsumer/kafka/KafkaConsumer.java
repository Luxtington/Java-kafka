package ru.luxtington.appConsumer.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "computerChannel", groupId = "my_consumer")
    public void listen(String message){
        System.out.println("Message received: " + message);
    }

}
