package day0517.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 약결합이 되기 위해서 DAO 인터페이스를 구현한다.
 * @author user
 */
public class OracleDAO implements DAO{

	public OracleDAO() {
		System.out.println("OracleDAO의 기본 생성자!");
	}//OracleDAO
	
	@Override
	public void insert(String name) throws SQLException {
		System.out.println("insert into oracle_tab(name) values('"+name+"')");
	}

	@Override
	public List<String> select() throws SQLException {
		List<String> list=new ArrayList<String>();
		list.add("Oracle DBMS select");
		list.add("마이클");
		list.add("제임스");
		list.add("에이미");
		
		
		return list;
	}

	
}
