package com.yedam.bicycle.service;

import com.yedam.common.DAO;

public class BicycleDAO extends DAO{
	
	//싱글톤
	private static BicycleDAO bDao = new BicycleDAO();
	
	private BicycleDAO() {
		
	}
	
	public static BicycleDAO getInstance() {
		return bDao;
	}
	
	//대여
	
	//반납
	
}
