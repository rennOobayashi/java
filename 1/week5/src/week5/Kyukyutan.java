package week5;

import java.util.Scanner;

public class Kyukyutan {
	public static void main(String[] args) {
		Scanner input_num = new Scanner(System.in);
		int num = 0;
		
		System.out.printf("Whats table?: ");
		num = input_num.nextInt();
		
		System.out.println("Table " + num);
		for (int i = 1; i < 10; ++i) {
			System.out.printf("%d * %d = %d\r\n", num, i, num * i);
		}
	}
}
