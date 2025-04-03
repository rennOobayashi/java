package week5;

public class RandomNumberNoSeven {
	public static void main(String[] args) {
		int rand = 0;
		
		while (true) {
			//0~10 (It just occurred to me out of the blue.)
			//rand = (int)(Math.random() * 12 - 1);
			
			rand = (int)(Math.random() * 10);

			System.out.print(rand);
			
			if (rand == 7) {
				break;
			}

			System.out.println();
		}
		
		System.out.println(" << Is not a allowed number.");
	}
}
