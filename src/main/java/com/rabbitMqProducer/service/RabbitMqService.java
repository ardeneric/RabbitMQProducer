package com.rabbitMqProducer.service;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbitMqProducer.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RabbitMqService {
	
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	@Autowired
	Exchange exchange;
	
	public void publishEmployee(Employee employee) {
		String routingKey = "employee";
		rabbitTemplate.convertAndSend(exchange.getName(),routingKey, employee );
		log.info("Message sent as: {}", employee.toString());
	}
}
