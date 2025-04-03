package week5;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner inputString = new Scanner(System.in);
		String inStr = "";
		
		System.out.println("Enter message.");
		System.out.println("q to exit program.");
		
		do {
			System.out.print(">> ");
			inStr = inputString.nextLine();

			System.out.printf("Your message: %s\r\n", inStr);
			
			//The String data type uses the equals() function 
			//when comparing values ​​in Java.
		} while(!inStr.toLowerCase().equals("q"));
		
		System.out.println("Exit.");
		
		inputString.close();
	}
}
