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
	 * ���ڿ� ������ ���� ��
	 * @param name
	 */
	public InjectionTest(String name) {
		this.name=name;
		System.out.println("java.lang.String�� ������ ���� ���� " +name);
	}
	
	
	/**
	 * ������ ������ ���� ��
	 * @param age
	 */
	public InjectionTest(int age) {
		this.age=age;
		System.out.println("int�� ������ ���� ����" +age);
	}
	
	
	/**
	 * java.util.List ������ ����
	 * @param list
	 */
	public InjectionTest(List<String> list) {
		this.list=list;
		System.out.println("list�� ������ ���� ����" +list);
	}
	
	
	
	
	/**
	 * java.util.Set ������ ����
	 * @param set
	 */
	public InjectionTest(Set<String> set) {
		this.set=set;
		System.out.println("set�� ������ ���� ����" +set);
	}
	
	
	
	/**
	 * java.util.Map������ ����
	 * @param set
	 */
	public InjectionTest(Map<String, String> map) {
		this.map=map;
		System.out.println("map�� ������ ���� ����" +map);
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
