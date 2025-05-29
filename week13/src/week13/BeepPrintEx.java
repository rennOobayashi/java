package week13;

public class BeepPrintEx {
	public static void main(String[] args) throws InterruptedException {
		//Print beep
		for (int i = 0; i < 5; ++i) {
			System.out.printf("Beep ");
			Thread.sleep(1000); //ms
		}
		System.out.println();
		
		//Print Nyann
		for (int i = 0; i < 5; ++i) {
			System.out.printf("Nyann ");
			Thread.sleep(1000);
		}
		System.out.println();
	}
}
