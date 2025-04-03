package week5;

public class ContinueEx2 {
	public static void main(String[] args) {
		int sum = 0;
		int sumExcluding = 0;
		
		for (int i = 1; i <= 100; ++i) {
			if (i % 3 == 0) {
				//Only for debug
				//System.out.println(i + "is excluding");
				sumExcluding += i;
				continue;
			}
			
			System.out.println(i);
			
			sum += i;
		}

		System.out.println();
		System.out.println("Sum excluding multiples of 3: " + sum);
		System.out.println("Sum of multiples of 3       : " + sumExcluding);
		System.out.println("Sum of both                 : " + (sum + sumExcluding));
	}
}
