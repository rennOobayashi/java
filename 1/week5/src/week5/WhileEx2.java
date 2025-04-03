package week5;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		Scanner input_num = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		//It doesn't end, but that's by design.
		while (true) {
			System.out.printf("Enter first  number: ");
			num1 = input_num.nextInt();
			
			System.out.printf("Enter second number: ");
			num2 = input_num.nextInt();
			
			System.out.printf("%d + %d = %d\r\n", num1, num2, num1 + num2);
		}
		
		//input_num.close();
	}
}
