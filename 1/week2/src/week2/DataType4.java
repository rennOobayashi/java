package week2;

public class DataType4 {
	public static void main(String[] args) {
		byte bData    = 127; 		//overflow
		char cData    = 90; 		//unsigned
		float fData   = 3.14f; 		//float형으로 캐스팅
		long lData    = 10000000000L; //정수형의 기본형은 integer형이기에 long형으로 캐스팅
		boolean boolD = true; 		//숫자 불가(노잼)
		
		System.out.println("bData = " + bData);
		System.out.println("bData = " + cData);
		System.out.println("bData = " + fData);
		System.out.println("bData = " + lData);
		System.out.println("bData = " + boolD);
	}
}
