package day0518;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpringContainer {

	
	public static void main(String[] agrs) {
		//1. Spring Container 생성
		ApplicationContext ac=new ClassPathXmlApplicationContext("day0518/applicationContext.xml");
				
		//2. bean 얻기
		InjectionTest it=ac.getBean("it",InjectionTest.class);
		
		System.out.println("문자열 "+it.getName()+",숫자 "+it.getAge());
		
		System.out.println("--------------------------------------------");
		
		InjectionTest itList=ac.getBean("itList",InjectionTest.class);
		System.out.println("문자열 "+itList.getName()+",숫자 "+itList.getAge());
		System.out.println("리스트 "+itList.getList());
		
		
		System.out.println("---------------------------------------------");
		
		InjectionTest itSet=ac.getBean("itSet",InjectionTest.class);
		System.out.println("set "+itSet.getSet()); //중복 제외시킴
		
		
		System.out.println("---------------------------------------------");
		
		InjectionTest itMap=ac.getBean("itMap",InjectionTest.class);
		System.out.println("map"+itMap.getMap()); //중복 제외시킴
		Map<String, String> map=itMap.getMap();
		System.out.println(map.get("Spring"));
		
		System.out.println("---------------------------------------------");
		Singleton single=ac.getBean(Singleton.class);
		System.out.println("singleton "+single.getData());
		
		
		//3. Spring Container 닫기
		((ClassPathXmlApplicationContext)ac).close();
	}
	
	
}
