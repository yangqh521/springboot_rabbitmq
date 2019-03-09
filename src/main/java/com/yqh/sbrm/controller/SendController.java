package com.yqh.sbrm.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yqh.sbrm.sender.FirstSender;

@RestController
@RequestMapping("/rm")
public class SendController {

	@Autowired
    private FirstSender firstSender;
 
	@RequestMapping("/send")
    public String send(String message){
        String uuid = UUID.randomUUID().toString();
        firstSender.send(uuid,message);
        return uuid;
    }

	
}
