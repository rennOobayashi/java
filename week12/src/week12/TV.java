package week12;

public class TV implements RemoteControl {
	public boolean power;
	
	@Override
	public void turnOn() {
		System.out.println("Meteorー");
		power = true;
	}
}
