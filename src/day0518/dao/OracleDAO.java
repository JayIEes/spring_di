package day0518.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 약결합이 되기 위해서 DAO 인터페이스를 구현한다.
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
		list.add("마이클");
		list.add("제임스");
		list.add("에이미");
		
		return list;
	}

	
}
