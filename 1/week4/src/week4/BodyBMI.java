package week4;

import java.util.Scanner;

public class BodyBMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String resultBMI;
		float height_m;
		float bmi;
		int height;
		int weight;
		
		System.out.printf("name  : ");
		name = sc.next();
		
		System.out.printf("height: ");
		height = sc.nextInt();
		
		System.out.printf("kg    : ");
		weight = sc.nextInt();
		
		System.out.println("Input data");
		System.out.println("============================");
		System.out.printf("name  : %s\r\nheight: %dcm\r\nkg    : %dkg\r\n", name, height, weight);
		
		height_m = (float)height / 100;
		bmi = (float)weight / (height_m * height_m);

		if (30 < bmi) {
			resultBMI = "severe obesity BMI";
		}
		else if (25 <= bmi && bmi < 30) {
			resultBMI = "obesity BMI";
		}
		else if (23 <= bmi && bmi < 25) {
			resultBMI = "overweight BMI";
		}
		else if (18.5 <= bmi && bmi < 23) {
			resultBMI = "normal BMI";
		}
		else {
			resultBMI = "underweight BMI";
		}
		
		System.out.printf("BMI   : %.2f(%s)\r\n", bmi, resultBMI);

		System.out.println("============================");
	}

}
