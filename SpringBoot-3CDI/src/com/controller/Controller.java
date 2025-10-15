package com.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Service;

public class Controller {
	
	private Service service;
	
	

	public Controller(Service service) {
	
		this.service = service;
	}

	public void control() {
		service.service();
	}
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Controller bean = (Controller)ac.getBean("control");
		bean.control();
	}
	

}
