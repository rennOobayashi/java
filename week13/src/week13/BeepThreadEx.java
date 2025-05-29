package week13;

public class BeepThreadEx {
	public static void main(String[] args) {
		//main method > main thread
		BeepThread bthread = new BeepThread();
		
		bthread.start();

		//Print Nyann
		for (int i = 0; i < 5; ++i) {
			try {
				System.out.println("Nyann");
				Thread.sleep(1000);
			}
			catch (Exception ex) {
				System.out.printf("Error: BeepThread(%s)", ex.getMessage());
			}
		}
		System.out.println();
	}
}
