package week13;

public class BeepTaskEx {
	public static void main(String[] args) {
		BeepTask beep = new BeepTask();
		Thread t = new Thread(beep);
		
		t.start();
		
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
