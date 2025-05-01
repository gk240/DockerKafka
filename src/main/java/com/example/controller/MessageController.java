package com.example.controller;

import com.example.dto.MessageRequest;
import com.example.service.KafkaMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class MessageController {

    @Autowired
    private KafkaMessageService kafkaMessageService;

    @PostMapping("/send")
    public String sendMessageToKafka(@RequestBody MessageRequest request) {
        kafkaMessageService.sendMessage(request.getMessage());
        return "Kafka Message: " + request.getMessage();
    }
}