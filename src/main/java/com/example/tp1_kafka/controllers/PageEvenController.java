package com.example.tp1_kafka.controllers;


import com.example.tp1_kafka.events.PageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class PageEvenController {
    @Autowired
    private StreamBridge streamBridge;
    @GetMapping("/publish")
    public PageEvent publish(String name, String topic){
        PageEvent event= new PageEvent(name, Math.random()>0.5?"U1":"U2",
                new Date(),
                10+new Random().nextInt());
        streamBridge.send(topic, event);
        return event;
    }
}
