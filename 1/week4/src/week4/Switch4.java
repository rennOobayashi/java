package week4;

import java.util.Scanner;

public class Switch4 {
	public static void main(String[] args) {
		String mobile = "Galaxy";
		
		switch (mobile) {
			case "iPhone" -> System.out.println("미제");
			case "Galaxy" -> System.out.println("국산");
			default -> System.out.println("기타");
		}
		
		//점수 입력받아 switch문으로 등급 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("score: ");
		int score = sc.nextInt();
		char grade = switch(score / 10) {
			case 9, 10 -> 'A';
			case 8 -> 'B';
			case 7 -> 'C';
			case 6 -> 'D';
			default -> 'F';
		};
		
		System.out.printf("%c 등급", grade);
		
		sc.close();
	}
}
