package week4;

//Nintendo Switch 2 :)
public class Switch2 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A': case'a': System.out.println("A 등급");
				break;
			case 'B': case'b': System.out.println("B 등급");
				break;
			case 'C': case'c': System.out.println("C 등급");
				break;
			case 'D': case'd': System.out.println("D 등급");
				break;
			default: System.out.println("F 등급");
		}
		
		System.out.println();
				
		//switch 표현식 java14~
		switch (grade) {
			case 'A', 'a' -> {
				System.out.println("A 등급");
				System.out.println("우수 회원");
			}
			case 'B', 'b' -> {
				System.out.println("B 등급");
				System.out.println("일반 회원");
			}
			default -> {
				System.out.println("E 등급");
				System.out.println("손님");
			}
		}
		
		System.out.println();
		
		switch (grade) {
		case 'A', 'a' -> System.out.println("우수 회원");
		case 'B', 'b' -> System.out.println("일반 회원");
		default -> System.out.println("손님");
		}
	}

}
