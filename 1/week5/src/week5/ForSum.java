package week5;

public class ForSum {
	public static void main(String[] args) {
		//for: a fixed number of repetitions
		//1 ~ 100 sum
		//Initialization required
		int sum = 0;
		
		for (int i = 1; i <= 100; ++i) {
			sum += i;
		}
		
		System.out.println("1 ~ 100 sum = " + sum);
	}
}
