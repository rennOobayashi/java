package week6;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		String[] names = new String[] 
				{"Nayutanseijin", "Deco27", "Jin", "Maretsu", "threee"};
		String findName = null;
		
		Scanner inputName = new Scanner(System.in);
		
		System.out.print("Please search for the P you looking for: ");
		findName = inputName.next();
		
		boolean isEqual = false;
		for (var name : names) {
			if (name.equals(findName)) {
				isEqual = true;
				break;
			}
		}
		
		if (isEqual) {
			System.out.printf("%sPometsukemashita", findName);
		}
		else {
			System.out.printf("%sPometsukarimasen", findName);
		}
	}

}
