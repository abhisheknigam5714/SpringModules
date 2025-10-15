package com.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Service;

public class Demo {

	private Service service;

	public void setService(Service service) {
		this.service = service;
	}

	public void get() {
		System.out.println("test-get method");
	}

	public void post() {
		System.out.println("test-post method");
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Demo test = (Demo)ac.getBean("demo");
		test.get();
		

	}

}
