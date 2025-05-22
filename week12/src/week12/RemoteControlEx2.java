package week12;

public class RemoteControlEx2 {

	public static void main(String[] args) {
		RemoteControl[] rc = new RemoteControl[] {new TV(), new Audio(), new SmartTV()};
		
		for (var r : rc) {
			System.out.println();
			System.out.println("-----");
			r.turnOn();
			r.setVolume(5);
			r.setMute(true);
			r.setMute(false);
			if (r instanceof SmartTV) {
				((SmartTV)r).search("nintendo.com");
			}
			r.turnOff();
		}
	}

}
