package com.yqh.sbrm.sender;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yqh.sbrm.config.RabbitMqConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class FirstSender {

	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	/**
     * 发送消息
     * @param uuid
     * @param message  消息
     */
    public void send(String uuid,Object message) {
        CorrelationData correlationId = new CorrelationData(uuid);
        rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE, RabbitMqConfig.ROUTINGKEY2, message, correlationId);
    }
	
	
	
}
