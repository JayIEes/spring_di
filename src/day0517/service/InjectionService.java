package day0517.service;

import day0517.dao.DAO;

/**
 * 다양한 의존성 주입 연습 
 * @author user
 */
public class InjectionService {

	private DAO dao;
	
	/**
	 * method 의존성 주입에 사용.
	 */
	public InjectionService() {
		System.out.println("InjectionService 기본 생성자");
		
	}//InjectionService
	
	
	
	/**
	 * 생성자 의존성 주입
	 * @param dao
	 */
	public InjectionService(DAO dao) {
		this.dao=dao;
		System.out.println("생성자 의존성 주입");
	}//InjectionService
	
	
	
	/**
	 * method 의존성 주입은 "기본 생성자"만 존재하는 경우에 사용.
	 * @param dao
	 */
	public void setDao(DAO dao) { 
		this.dao=dao;
		System.out.println("method(property)의존성 주입");
	}


	public DAO getDao() { 
		return dao;
	}

}


