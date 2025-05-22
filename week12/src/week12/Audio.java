package week12;

public class Audio implements RemoteControl {
	private int volume = 0;
	
	@Override
	public void turnOn() {
		System.out.println("Trun ON");
		System.out.println("How to Warp");
	}

	@Override
	public void turnOff() {
		System.out.println("rocket sider");
		System.out.println("Turn OFF");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VALUE) {
			volume = MAX_VALUE;
		}
		else if (volume < MIN_VALUE) {
			volume = MIN_VALUE;
		}
		else {
			this.volume = volume;
		}

		System.out.println("Audio Volume: " + volume);
	}
}
