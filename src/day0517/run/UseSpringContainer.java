package day0517.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day0517.dao.MysqlDAO;
import day0517.dao.DAO;
import day0517.dao.OracleDAO;
import day0517.service.Service;
import day0517.service.ServiceImpl;

public class UseSpringContainer {

	public static void main(String[] args) {

		//1. Spring Container 생성 (설정 파일에 존재하는 클래스를 생성한다.)
		ApplicationContext ac=new ClassPathXmlApplicationContext("day0517/run/applicationContext.xml");//설정파일이 여러 개이면 배열로 넣으면 됨.
		//System.out.println(ac);
		
		//2. bean 얻기
		//의존성 주입할 객체 얻기 - 얻을 필요는 없음  
		DAO dao=(DAO)ac.getBean(MysqlDAO.class); //부모로 받을 때에는 casting
		OracleDAO od=ac.getBean(OracleDAO.class); // prototype - getBean으로 얻을 때마다 생성
		DAO dao1=(DAO)ac.getBean(MysqlDAO.class);//singleton
		OracleDAO od1=ac.getBean(OracleDAO.class);// prototype - getBean으로 얻을 때마다 생성
		
		System.out.println("dao 객체주소 : "+dao);
		System.out.println("dao1 객체주소 : "+dao1);
		System.out.println("od 객체주소 : "+od);
		System.out.println("od1 객체주소 : "+od1);
		
		//의존성 주입받은 객체 얻기
		Service service=ac.getBean(ServiceImpl.class);
		
		//업무 처리 method를 호출
		service.addMember("마이클");
		System.out.println(service.searchMember());
		
		//ApplicationContext의 사용이 끝났으면 메모리 누수를 막기 위해 닫아야 한다.
		((ClassPathXmlApplicationContext)ac).close();
	}

}



