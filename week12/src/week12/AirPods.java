package week12;

public class AirPods implements Earphone {
	public AirPods() {
		System.out.println("Connect to AirPods.");
	}
	
	@Override
	public void play() {
		System.out.println("Play in AirPods....");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop playing in AirPods.");
	}
}
