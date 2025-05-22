package week12;

import java.util.Scanner;

public class EarphoneEx {

	public static void main(String[] args) {
		Earphone ep;
		SmartPhone phone = new SmartPhone();
		Scanner sc = new Scanner(System.in);
		
		int intput = -1;
		do {
			System.out.println("1: Buds, 2: TonFree, 3: AirPods, 4: exit");
			System.out.printf("Choice: ");
			intput = sc.nextInt();

			if (intput == 4) {
				break;
			}
			else if (intput == 1) {
				ep = new Buds();
			}
			else if (intput == 2) {
				ep = new TonFree();
			}
			else if (intput == 3) {
				ep = new AirPods();
			}
			else {
				System.out.println("Unknown error");
				break;
			}
			
			phone.musicOn(ep);
			phone.musicOff();
			System.out.println();
		} while(true);
	}

}
