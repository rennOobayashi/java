package week4;

public class RandomDIce {
	public static void main(String[] args) {
		//random function: Math.random() <-0 ~ 0.999... double type
		double num = Math.random();
		
		System.out.println("random: " + num);
		
		//1 ~ 6
		int dice_number;
		
		for (int i = 0; i < 5; ++i) {
			dice_number = (int)(Math.random() * 6 + 1);
			System.out.println("dice!(" + dice_number + ")");
		}
	}
}
