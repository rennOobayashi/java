package week12;

public class Buds implements Earphone {
	public Buds() {
		System.out.println("Connect to Buds.");
	}
	
	@Override
	public void play() {
		System.out.println("Play in Buds....");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop playing in Buds.");
	}
}
