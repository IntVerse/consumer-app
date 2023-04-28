package com.intverse.consumer.stream;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class IntverseConsumer {
    @KafkaListener(topics = "intverse-topic")
    public void consume(String message) {
        System.out.println("Consumed Message = " + message);
    }
}