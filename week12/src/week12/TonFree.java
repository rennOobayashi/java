package week12;

public class TonFree implements Earphone {
	public TonFree() {
		System.out.println("Connect to TonFree.");
	}
	
	@Override
	public void play() {
		System.out.println("Play in TonFree....");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop playing in TonFree.");
	}
}
