package week12;

public class RemoteControlEx {
	public static void main(String[] args) {
		Audio audio = new Audio();
		TV tv = new TV();
		
		tv.turnOn();
		audio.turnOn();
	}
}
