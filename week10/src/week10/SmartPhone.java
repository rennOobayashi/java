package week10;

public class SmartPhone extends Phone {
	private boolean wifi;
	
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		
		System.out.println("Change wifi status.");
	}
	
	public boolean isWifi() {
		return wifi;
	}
	
	public void internet() {
		if (isWifi()) {
			System.out.println("Connect.");
		}
		else {
			System.out.println("Disconnect");
		}
	}
}
