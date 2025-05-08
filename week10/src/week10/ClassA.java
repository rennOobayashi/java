package week10;

public class ClassA {
	ClassA c1 = new ClassA(true);
	ClassA c2 = new ClassA(10);
	ClassA c3 = new ClassA("string");
	
	ClassA () {
		
	}
	
	//default Access restrictor
	//Only for same package
	ClassA (int data) {
		
	}

	public ClassA (boolean data) {
		
	}

	private ClassA (String data) {
		
	}
}
