package day0518;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpringContainer {

	
	public static void main(String[] agrs) {
		//1. Spring Container ����
		ApplicationContext ac=new ClassPathXmlApplicationContext("day0518/applicationContext.xml");
				
		//2. bean ���
		InjectionTest it=ac.getBean("it",InjectionTest.class);
		
		System.out.println("���ڿ� "+it.getName()+",���� "+it.getAge());
		
		System.out.println("--------------------------------------------");
		
		InjectionTest itList=ac.getBean("itList",InjectionTest.class);
		System.out.println("���ڿ� "+itList.getName()+",���� "+itList.getAge());
		System.out.println("����Ʈ "+itList.getList());
		
		
		System.out.println("---------------------------------------------");
		
		InjectionTest itSet=ac.getBean("itSet",InjectionTest.class);
		System.out.println("set "+itSet.getSet()); //�ߺ� ���ܽ�Ŵ
		
		
		System.out.println("---------------------------------------------");
		
		InjectionTest itMap=ac.getBean("itMap",InjectionTest.class);
		System.out.println("map"+itMap.getMap()); //�ߺ� ���ܽ�Ŵ
		Map<String, String> map=itMap.getMap();
		System.out.println(map.get("Spring"));
		
		System.out.println("---------------------------------------------");
		Singleton single=ac.getBean(Singleton.class);
		System.out.println("singleton "+single.getData());
		
		
		//3. Spring Container �ݱ�
		((ClassPathXmlApplicationContext)ac).close();
	}
	
	
}
