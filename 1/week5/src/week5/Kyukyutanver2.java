package week5;

public class Kyukyutanver2 {

	public static void main(String[] args) {
		//Postincrement copies the original value and then adds it,
		//making preincrement more memory efficient.
		//However, these days, the difference between the two is said to be 
		//minimal as compilers are optimized.
		
		for (int x = 2; x <= 9; ++x) {
			System.out.println("==========");
			System.out.println(" Table " + x);
			System.out.println("==========");
			for (int y = 1; y <= 9; ++y) {
				System.out.printf("%d * %d = %2d\r\n", x, y, x * y);
			}
		}
		System.out.println("==========");
	}

}
