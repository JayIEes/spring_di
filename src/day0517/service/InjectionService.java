package day0517.service;

import day0517.dao.DAO;

/**
 * �پ��� ������ ���� ���� 
 * @author user
 */
public class InjectionService {

	private DAO dao;
	
	/**
	 * method ������ ���Կ� ���.
	 */
	public InjectionService() {
		System.out.println("InjectionService �⺻ ������");
		
	}//InjectionService
	
	
	
	/**
	 * ������ ������ ����
	 * @param dao
	 */
	public InjectionService(DAO dao) {
		this.dao=dao;
		System.out.println("������ ������ ����");
	}//InjectionService
	
	
	
	/**
	 * method ������ ������ "�⺻ ������"�� �����ϴ� ��쿡 ���.
	 * @param dao
	 */
	public void setDao(DAO dao) { 
		this.dao=dao;
		System.out.println("method(property)������ ����");
	}


	public DAO getDao() { 
		return dao;
	}

}


