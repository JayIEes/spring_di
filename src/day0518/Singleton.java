package day0518;

public class Singleton {

	private static Singleton single;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() { //�̱��� �޼ҵ�� �ܺο��� ���� ���� �� �� ������ ����� ���� �ʽ��ϴ�.
		if(single==null) {
			single=new Singleton();
		}
		return single;
	}//getInstance
	
	
	public String getData() {
		return "������ 2022.05";
	}
	
	
}
