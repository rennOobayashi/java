package week5;

public class WhileEx1 {
	public static void main(String[] args) {
		//1~100 sum
		int num = 1;
		int sum = 0;
		
		//When added after increasing 1, it is < 100
		while (num <= 100) {
			//sum += ++num;
			sum += num;
			
			++num;
		}
		
		System.out.println(sum);
	}
}
