package day0518;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class InjectionTest {

	private String name;
	private int age;
	private List<String> list;
	private Set<String> set;
	private Map<String,String> map;
	
	/**
	 * 문자열 의존성 주입 받
	 * @param name
	 */
	public InjectionTest(String name) {
		this.name=name;
		System.out.println("java.lang.String을 의존성 주입 받음 " +name);
	}
	
	
	/**
	 * 정수를 의존성 주입 받
	 * @param age
	 */
	public InjectionTest(int age) {
		this.age=age;
		System.out.println("int을 의존성 주입 받음" +age);
	}
	
	
	/**
	 * java.util.List 의존성 주입
	 * @param list
	 */
	public InjectionTest(List<String> list) {
		this.list=list;
		System.out.println("list를 의존성 주입 받음" +list);
	}
	
	
	
	
	/**
	 * java.util.Set 의존성 주입
	 * @param set
	 */
	public InjectionTest(Set<String> set) {
		this.set=set;
		System.out.println("set을 의존성 주입 받음" +set);
	}
	
	
	
	/**
	 * java.util.Map의존성 주입
	 * @param set
	 */
	public InjectionTest(Map<String, String> map) {
		this.map=map;
		System.out.println("map을 의존성 주입 받음" +map);
	}

	
	

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public List<String> getList() {
		return list;
	}


	public Set<String> getSet() {
		return set;
	}

	

	public Map<String, String> getMap() {
		return map;
	}


	

}
