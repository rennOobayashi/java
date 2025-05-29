package week13;

public class BeepThread extends Thread {
	@Override
	public void run() {
		//task
		for (int i = 0; i < 5; ++i) {
			try {
				System.out.printf("Beep ");
				Thread.sleep(1000); //ms
			}
			catch (Exception ex) {
				System.out.printf("Error: BeepThread(%s)", ex.getMessage());
			}
		}
		System.out.println();
	}
}
