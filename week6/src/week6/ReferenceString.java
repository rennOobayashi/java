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
			System.out.println("tobashi my number");
		}
		else {
			System.out.println("tabashikunai my number");
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
	
		//find string
		//indexOf: Return the index in a string where a specific word begin
		//if not found, return -1
		int ind = oldStr.indexOf("programming");
		
		if (ind < 0) {
			System.out.println("not found");
		}
		else {
			System.out.println("guess");
		}

		//Check if string is included
		boolean result = oldStr.contains("Java");
		
		if (result) {
			System.out.println("aru");
		}
		else {
			System.out.println("nai");
		}
		
		//Separation string
		String board = "1,Java,Reference type,String class,hayashi";
		String[] strArray = board.split(",");
		
		//for(int i = 0; i < strArray.length; ++i) {
		for (String s : strArray) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	}
}
