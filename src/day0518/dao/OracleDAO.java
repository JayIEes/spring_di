package day0518.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * ������� �Ǳ� ���ؼ� DAO �������̽��� �����Ѵ�.
 * @author user
 */
@Component
public class OracleDAO{ 

	public void insert(String name) throws SQLException {
		System.out.println("insert into oracle_tab(name) values('"+name+"')");
	}

	
	public List<String> select() throws SQLException {
		List<String> list=new ArrayList<String>();
		list.add("Oracle DBMS select");
		list.add("����Ŭ");
		list.add("���ӽ�");
		list.add("���̹�");
		
		return list;
	}

	
}
