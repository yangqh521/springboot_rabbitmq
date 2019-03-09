package com.yqh.sbrm.mqcallback;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.connection.CorrelationData;
 
/**
 * 消息发送到交换机确认机制 
 * @author Yang.Qinghui
 */
public class MsgSendConfirmCallBack implements RabbitTemplate.ConfirmCallback {
 
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        System.out.println("[ MsgSendConfirmCallBack ] callback:" + correlationData);
        if (ack) {
            System.out.println("消息消费成功");
        } else {
            System.out.println("消息消费失败:" + cause + "\n重新发送");
        }
    }


}