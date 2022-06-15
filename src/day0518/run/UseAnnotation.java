package day0518.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day0518.service.ServiceImpl;

public class UseAnnotation {

	public static void main(String[] args) {

		//1. Spring Container����
		ApplicationContext ac=new ClassPathXmlApplicationContext("day0518/run/applicationContext.xml");
		
		//2. bean ���
		ServiceImpl si=ac.getBean(ServiceImpl.class);
		System.out.println(si.searchMember());
		
		//3. �ݱ�
		((ClassPathXmlApplicationContext)ac).close();
		
	}//main

}



