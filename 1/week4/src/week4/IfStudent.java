package week4;
//Scanner Class import
import java.util.Scanner;

public class IfStudent {
	public static void main(String[] args) {
		//input -> Scanner Class
		Scanner sc = new Scanner(System.in);
		int age;
		String main_job = "";
		
		System.out.printf("태어난 년도 입력: ");
		age = 2025 - sc.nextInt();

		if (20 <= age && age <= 26) {
			main_job = "대학생";
		}
		else if (17 <= age && age < 20) {
			main_job = "고등학생";
		}
		else if (14 <= age && age < 17) {
			main_job = "중학생";
		}
		else if (8 <= age && age < 14) {
			main_job = "초등학생";
		}
		
		if (main_job != "" ) {
			System.out.printf("당신은 %s입니다.\r\n", main_job);
		}
		else {
			System.out.println("당신은 학생이 아닙니다.");
			//System.out.println("당신은 유치원생 이하이거나 사회인입니다.");
		}
	}
}
