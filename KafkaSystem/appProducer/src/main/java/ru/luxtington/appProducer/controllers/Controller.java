package ru.luxtington.appProducer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.luxtington.appProducer.dao.ComputerDao;
import ru.luxtington.appProducer.kafka.KafkaProducer;
import ru.luxtington.appProducer.model.Computer;

@RestController
public class Controller {
    private final KafkaProducer kafkaProducer;
    private final ComputerDao computerDao;

    @Autowired
    public Controller(KafkaProducer kafkaProducer, ComputerDao computerDao) {
        this.kafkaProducer = kafkaProducer;
        this.computerDao = computerDao;
    }

    @PostMapping("/kafka/send/{id}")
    public String send(@PathVariable int id){
        Computer computer = computerDao.getComputerByIndex(id);
        kafkaProducer.sendMessage(computer.toString());
        return "index";
    }
}
