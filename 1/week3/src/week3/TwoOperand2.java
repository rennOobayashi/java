package week3;

public class TwoOperand2 {

	public static void main(String[] args) {
		//비교연산자: >, <, ==, >=, <=, !=
		//논리연산자: &&, ||, !, &, |, ^
		
		int charCode1 = 'A';
		
		//  true		 true : And는 전부 대문자인 경우만 true
		//65 <= charCode1 <= 90
		if (65 <= charCode1&& charCode1 <= 90) {
			System.out.println((char)charCode1 + "은(는) 알파벳 대문자입니다.");
		}
		
		
		int charCode2 = 'b';
		
		//97 <= charCode <= 122
		if (97 <= charCode2 && charCode2 <= 122) {
			System.out.println((char)charCode2 + "은(는) 알파뱃 소문자입니다.");
		}
		
		
		char charCode3 = '9';
		
		if (!(57 < charCode3) && !(charCode3 < 48)) {
			//57 >= charCode3 >= 48
			System.out.println(charCode3 + "은(는) 0~9 사이의 숫잡입니다.");
		}
		
		
		int iValue = 4;

		//        true				   false : Or는 둘중 하나라도 true면 true
		if ((iValue % 2 == 0) || (iValue % 3 == 0)) {
			System.out.println(iValue + "은(는) 2 또는 3의 배수입니다.");
		}
	}

}
