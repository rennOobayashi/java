package week6;

public class Reference1 {
	public static void main(String[] args) {
		//Primitive data type are stored with their values in the stack area
		int iValue1 = 100;
		int iValue2 = 100;
		
		System.out.println("iValue1 == iValue2 : " + ((iValue1 == iValue2) ? true : false ));
		
		//Reference type variable's value stored in the heap area
		//and object address is stored in a variable on the stack
		//string is the most representative class type
		String sValue1 = "Java";
		String sValue2 = "Java";

		System.out.println("sValue1 == sValue2 : " + ((sValue1 == sValue2) ?  "hitoshi" : "hitoshikunai"));
		
		//new operator unconditionally creates a new string and store it
		String sValue3 = new String("Java");
		String sValue4 = new String("Java");

		System.out.println("sValue3 == sValue4 : " + ((sValue3 == sValue4) ? "hitoshi" : "hitoshikunai"));
		
		String sValue5 = null;
		//Null pointer exception
		//System.out.println("sValue5.length : " + sValue5.length());
		
		sValue5 = "Java";
		System.out.println("sValue1 == sValue2 : " + ((sValue1 == sValue5) ? "hitoshi" : "hitoshikunai"));
		
		
		//To compare whether string objects have the same string,
		//use the equals method
		
		if (sValue3.equals(sValue4)) {
			System.out.println("hitoshi");
		}
		else {
			System.out.println("hitoshikunai");
		}
		
	}
}
