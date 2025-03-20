package week3;

public class OneOperand2 {
	public static void main(String[] args) {
		//단항연산자 : 증감연산자 (++, --)
		int x = 10;
		int y = 10;
		int z;
		
		//++ : 피연산자의 기존 값에 1을 더함
		//++ 기호 위치 중요(전위: 1을 더한 후 명령 실행, 후위: 명령 실행 후 1을 더함)
		System.out.println("++x = " + (++x));
		System.out.println("x++ = " + (x++));
		System.out.println("x   = " + x + "\r\n");
		
		z = x++;
		System.out.println("z   = " + z);
		System.out.println("x   = " + x + "\r\n");
		
		z = ++x + y--;
		System.out.println("z   = " + z);
		System.out.println("x   = " + x);
		System.out.println("y   = " + y);
	}
}
