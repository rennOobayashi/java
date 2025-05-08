package week10;

//추상화
public class Phone {
	public String model;
	public String color;
	
	public Phone() {}
	
	public void bell() {
		System.out.println("Ring, ring!");
	}
	
	public void sendVoice(String msg) {
		System.out.println("Watashi: " + msg);
	}
	
	public void receiveVoice(String msg) {
		System.out.println("Anata: " + msg);
	}
	
	public void hangUp() {
		System.out.println("End call.");
	}
}
