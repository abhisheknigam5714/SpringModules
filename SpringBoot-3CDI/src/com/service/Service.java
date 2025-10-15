package com.service;

import com.dao.Dao;

public class Service {
	
	private Dao dao;


	public Service(Dao dao) {
		
		this.dao = dao;
	}


	public void service() {
		dao.dao1();
		dao.dao2();
		
	}
	

}
