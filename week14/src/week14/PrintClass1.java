package week14;

public class PrintClass1 {
	//Data IO, overloading
	public void printValue(int value) {
		System.out.println("Value - " + value);
	}
	
	public void printValue(String value) {
		System.out.println("Value - \"" + value + "\"");
	}

	public void printValue(boolean value) {
		System.out.println("Value - " + value);
	}	
}
