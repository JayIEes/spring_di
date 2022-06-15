package day0518.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import day0517.dao.DAO;
import day0518.dao.OracleDAO;

@Component
public class ServiceImpl {

	@Autowired(required = false)
	private OracleDAO dao;
	
	
	public void addMember(String name) {
		try {
			dao.insert(name);
			System.out.println("DB table에 추가 성공");
		} catch (SQLException e) {
			System.out.println("DB table에 추가 실패");
			e.printStackTrace();
		}//end catch
		
	}//addMember

	
	
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
