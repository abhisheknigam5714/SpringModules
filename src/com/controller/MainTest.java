package com.controller;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest {
	
	public static void main(String[] args) {

	/*	Resource resource = new ClassPathResource("bean.xml");
		
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		
		Object bean = xmlBeanFactory.getBean("demo");
		*/
		
		
		
	ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	Demo d =(Demo) ac.getBean("demo");
	d.get();
	
	
	}

}
