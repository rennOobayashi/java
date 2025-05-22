package week12;

public class SmartTV implements RemoteControl, Searchable {
	private int volume = 0;
	
	@Override
	public void search(String url) {
		System.out.println("Searching - "  + url);
	}

	@Override
	public void turnOn() {
		System.out.println("Smart TV ON");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart TV OFF");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VALUE) {
			volume = MAX_VALUE;
			return;
		}
		else if (volume < MIN_VALUE) {
			volume = MIN_VALUE;
		}
		else {
			this.volume = volume;
		}

		System.out.println("Smart TV Volume: " + volume);
	}

}
