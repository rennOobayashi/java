package week3;

public class ThreeOperand1 {

	public static void main(String[] args) {
		//삼항연산자 => (boolean) ? true : false
		int num1 = 35;
		int num2 = 47;
		String result = (num1 > num2) ? "num1이 더 큽니다." : "num2가 더 큽니다.";
		
		System.out.println(result);
		
		boolean bResult = (num1 > num2) ? true : false;
		
		System.out.println(bResult);
		
		int score = 85;
		result = (score >= 90) ? "우수" : (score >= 80) ? "굿" : "보통";
		
		System.out.println(result);
	}

}
