package week6;

public class ReferenceString {
	public static void main(String[] args) {
		String myNumber = "0507253168522";
		//String are indexed staring from 0, like arrays
		//Extract 1 character
		char gender  = myNumber.charAt(6);
		
		switch(gender) {
			case '1', '3': System.out.println("otoko");
				break;
			case '2', '4': System.out.println("onnanoko");
		}
		
		int length = myNumber.length();
		
		if (length == 13) {
			System.out.println("올바른 마이넘버");
		}
		else {
			System.out.println("잘못된 마이넘버");
		}
		
		//String replace
		String oldStr = "Java programing";
		String newStr = oldStr.replace("programing", "programming");
		
		System.out.println("Before: " + oldStr);
		System.out.println("After : " + newStr);
		
		//Reference to part of a string
		String birthdayNumber = myNumber.substring(0, 6);
		System.out.println("Birthday: " + birthdayNumber);
		
		String verNumber = myNumber.substring(6);
		System.out.println("Verification number: " + verNumber);
	}
}
