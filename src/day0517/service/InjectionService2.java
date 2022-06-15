package day0517.service;

public class InjectionService2 {

	private String name;
	
	public InjectionService2(String name) {
		this.name=name;
		System.out.println("문자열을 의존성 주입받는 생성자");
	}//
	
	public String getName() {
		return name;
	}
	
	
}//class
