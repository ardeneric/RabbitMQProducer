package com.rabbitMqProducer.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable{
	private static final long serialVersionUID = 558384178728553608L;
	private String id;
	private String empName;
}
