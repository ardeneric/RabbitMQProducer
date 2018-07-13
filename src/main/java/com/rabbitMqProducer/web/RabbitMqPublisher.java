package com.rabbitMqProducer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitMqProducer.entity.Employee;
import com.rabbitMqProducer.service.RabbitMqService;

@RestController
public class RabbitMqPublisher {
	
	@Autowired
	RabbitMqService rabbitMqSender;
	
	//@GetMapping("producer")
	@Scheduled(fixedDelay = 1000)
	public void producer() {
		Employee emp = new Employee();
		emp.setEmpName("Eric arden");
		emp.setId("23-de-45");
		rabbitMqSender.publishEmployee(emp);
	}

}
