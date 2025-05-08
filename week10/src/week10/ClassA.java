package week10;

public class ClassA {
	ClassA c1 = new ClassA(true);
	ClassA c2 = new ClassA(10);
	ClassA c3 = new ClassA("string");
	
	ClassA () {
		
	}
	
	//default 접근 제한자
	//같은 패키지 내에서만 사용 가능
	ClassA (int data) {
		
	}

	//모든 클래스에서 사용 가능
	public ClassA (boolean data) {
		
	}
	
	//같은 클래스 내에서만 사용 가능
	private ClassA (String data) {
		
	}
}
