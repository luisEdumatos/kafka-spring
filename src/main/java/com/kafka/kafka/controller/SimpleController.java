package com.kafka.kafka.controller;

import com.kafka.kafka.model.FieldModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first/kafka")
public class SimpleController {

    @Autowired
    private KafkaTemplate<String, FieldModel> kafkaTemplate;

    @PostMapping
    public void post(@RequestBody FieldModel fieldModel) {
        kafkaTemplate.send("testeJava", fieldModel);
    }
}
