package day0517.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day0517.dao.DAO;

public class ServiceImpl implements Service{

	private DAO dao;
	
	
	/**
	 * ������ ������ �޴� ������ 
	 */
	public ServiceImpl(DAO dao) {
		System.out.println("ServiceImpl ������"+dao);
		this.dao=dao;
	}
	
	@Override
	public void addMember(String name) {
		try {
			dao.insert(name);
			System.out.println("DB table�� �߰� ����");
		} catch (SQLException e) {
			System.out.println("DB table�� �߰� ����");
			e.printStackTrace();
		}//end catch
		
	}//addMember

	@Override
	public List<String> searchMember() {
		List<String> list= new ArrayList<String>();
		
		try {
			list=dao.select();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}//searchMember
	
}
