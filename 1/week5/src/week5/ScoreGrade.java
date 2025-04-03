package week5;

import java.util.Scanner;

public class ScoreGrade {
	public static void main(String[] args) {
		Scanner inputScore = new Scanner(System.in);
		char grade = 0;
		int score = 0;
		
		System.out.println("Negative number to exit.\r\n");
		
		do {
			System.out.print("Enter score >> ");
			score = inputScore.nextInt();
			
			if (90 <= score && score <= 100) {
				grade = 'A';
			}
			else if (80 <= score && score < 90) {
				grade = 'B';
			}
			else if (70 <= score && score < 80) {
				grade = 'C';
			}
			else if (60 <= score && score < 70) {
				grade = 'D';
			}
			else if (0 <= score && score < 60) {
				grade = 'F';
			}
			else if (score < 0) {
				break;
			}
			else {
				System.out.println("\r\nWrong score, please enter again.");
				
				continue;
			}

			System.out.println("\r\nSCORE\t\tGRADE");
			System.out.println("=====================");
			System.out.printf("  %c\t         %3d\r\n\r\n", grade, score);
		} while(score >= 0);
		
		System.out.println("\r\nExit program.");
		
		inputScore.close();
	}
}
