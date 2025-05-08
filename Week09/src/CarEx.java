import java.util.Scanner;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		int gasVal;
		Scanner sc = new Scanner(System.in);
		
		myCar.setGas(5);
		
//		if (myCar.isLeftGas()) {
//			System.out.println("출발합니다.");
//		}
//		
		
		while (myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			myCar.run();
			
			System.out.println("가스를 주입하세요 >> ");
			gasVal = sc.nextInt();
			
			myCar.setGas(gasVal);			
		}

		System.out.println("프로그램 종료");		
	}

}
