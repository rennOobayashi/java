package week4;

public class IfNested {
	public static void main(String[] args) {
		//0~100 integer number
		int score = (int)(Math.random() * 100 + 1);
		
		String grade;
		
		if (score >= 90) {
			if (score > 95) {
				grade = "A+";
			}
			else if (93 < score && score <= 95) {
				//93 < score <= 95
				grade = "A0";
			}
			else {
				grade = "A-";
			}
		}
		else if (score >= 80) {
			if (score > 85) {
				grade = "B+";
			}
			else if (score > 83) {
				grade = "B0";
			}
			else {
				grade = "B-";
			}
		}
		else if (score >= 70) {
			if (score > 75) {
				grade = "C+";
			}
			else if (score > 73) {
				//93 < score <= 95
				grade = "C0";
			}
			else {
				grade = "C-";
			}
		}
		else if (score >= 60) {
			if (score > 65) {
				grade = "D+";
			}
			else if (score > 63) {
				//93 < score <= 95
				grade = "D0";
			}
			else {
				grade = "D-";
			}
		}
		else { 
			grade = "F";
		}
		
		System.out.printf("grade: %s(%d)", grade, score);
	}
}
