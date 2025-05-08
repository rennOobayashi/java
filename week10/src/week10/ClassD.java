package week10;

public class ClassD {
	//field 접근 제한자
	public int field1;
	/*default*/ int field2;
	private int field3;
	
	public ClassD() {
		//같은 클래스라 제한자 영향 없음
		field1 = 10;
		field2 = 15;
		field3 = 30;
		
		method1();
		method2();
		method3();
	}
	
	//method 접근 제한자
	public void method1() {}
	void method2() {}
	private void method3() {}
	
}
