package ru.luxtington.appProducer.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic newTopic(){
        return new NewTopic("computerChannel", 1, (short) 1);
    }
}
