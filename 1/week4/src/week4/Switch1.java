package week4;

public class Switch1 {
	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
			case 'A': System.out.println("A 등급");
				break;
			case 'B': System.out.println("B 등급");
				break;
			case 'C': System.out.println("C 등급");
				break;
			case 'D': System.out.println("D 등급");
				break;
			default:  System.out.println("F 등급");
		}
	}
}
