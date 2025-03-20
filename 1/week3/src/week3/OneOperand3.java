package week3;

public class OneOperand3 {

	public static void main(String[] args) {
		//비트 반전 연산자(field): ~
		//2진수로 연산
		
		int var1 =  10;
		int var2 = ~var1;
		int var3 = ~var1 + 1;
		
		//부호비트도 반전됨
		System.out.println("var1 =  " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		
		System.out.printf("십진수( %d) : %32s\r\n", var1, Integer.toBinaryString(var1));
		System.out.printf("십진수(%d) : %32s\r\n", var2, Integer.toBinaryString(var2));
		System.out.printf("십진수(%d) : %32s\r\n", var3, Integer.toBinaryString(var3));
	}

}
