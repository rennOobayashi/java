package week12;

public class TV implements RemoteControl {
	private int volume = 0;
	
	@Override
	public void turnOn() {
		System.out.println("Turn ON");
		System.out.println("Meteorー");
	}
	
	@Override
	public void turnOff() {
		System.out.println("esperーepserー");
		System.out.println("Turn OFF");
	}
	
	@Override
	public void setVolume(int volume) {
		//유효성 검사
		if (volume > MAX_VALUE) {
			volume = MAX_VALUE;
		}
		else if (volume < MIN_VALUE) {
			volume = MIN_VALUE;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("TV Volume: " + volume);
	}
}
