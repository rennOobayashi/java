package week10;

public class SmartPhone extends Phone {
	private boolean wifi;
	
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public boolean isWifi() {
		return wifi;
	}
	
	public void internet() {
		System.out.println("Connect.");
	}
}
