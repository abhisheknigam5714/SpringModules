package com.service;

import com.Dao.Dao;

public class Service {

	private Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public void m1() {
		System.out.println("Service m1 method");
	}

	public void m2() {
		System.out.println("services m2 method");
	}

}
