package week13;

public class BeepTask implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; ++i ) {
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
