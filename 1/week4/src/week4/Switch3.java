package week4;

public class Switch3 {
	public static void main(String[] args) {
		String grade = "B";
		int score1 = 0;
		
		switch (grade) {
			case "A": score1 = 100;
				break;
			case "B": score1 = 100 - 20;
				break;
			default: score1 = 100 - 40;
		}
		
		System.out.println("score1: " + score1 + "\r\n");
		
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> { 
				int result = 100 - 20;
				yield result;
			}
			default -> {
				int result = 100 - 40; 
				yield result;
			}
		};
		
		System.out.println("score2: " + score2 + "\r\n");
	}
}
