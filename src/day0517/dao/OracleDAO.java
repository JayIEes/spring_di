package day0517.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * ������� �Ǳ� ���ؼ� DAO �������̽��� �����Ѵ�.
 * @author user
 */
public class OracleDAO implements DAO{

	public OracleDAO() {
		System.out.println("OracleDAO�� �⺻ ������!");
	}//OracleDAO
	
	@Override
	public void insert(String name) throws SQLException {
		System.out.println("insert into oracle_tab(name) values('"+name+"')");
	}

	@Override
	public List<String> select() throws SQLException {
		List<String> list=new ArrayList<String>();
		list.add("Oracle DBMS select");
		list.add("����Ŭ");
		list.add("���ӽ�");
		list.add("���̹�");
		
		
		return list;
	}

	
}
