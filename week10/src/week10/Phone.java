package week10;

//추상화
public class Phone {
	private String model;
	private String color;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		
		System.out.println("Phone Constructor.");
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
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
