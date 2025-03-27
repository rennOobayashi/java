package week4;

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int discount = 0;
		int total_price = 0;
		int price = 0;
		
		System.out.printf("enter all price >> ");
		price = sc.nextInt();
		
		if (price / 10000 >= 10) {
			discount = 10;
		}
		else if (price / 10000 >= 5) {
			discount = 5;
		}
		
		total_price = price - (price * discount / 100);
		
		
		System.out.println("default price: " + price);
		System.out.println("discount rate: " + discount + "%");
		System.out.println("total price  : " + total_price);
	}
}
