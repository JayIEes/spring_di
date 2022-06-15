package day0518;

public class Singleton {

	private static Singleton single;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() { //싱글턴 메소드는 외부에서 값을 받을 수 도 있지만 현재는 받지 않습니다.
		if(single==null) {
			single=new Singleton();
		}
		return single;
	}//getInstance
	
	
	public String getData() {
		return "오늘은 2022.05";
	}
	
	
}
