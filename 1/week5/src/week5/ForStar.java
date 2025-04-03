package week5;


public class ForStar {
	public static void main(String[] args) {
		int rand = (int)(Math.random() * 10 + 1);
		
		System.out.println("random number: " + rand);
		
		for (int i = 0; i < rand; ++i) {
			System.out.printf("☆");
			//System.out.printf("ぽ");
		}
		System.out.println();
	}
}
