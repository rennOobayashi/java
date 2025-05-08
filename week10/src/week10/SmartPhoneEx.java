package week10;

public class SmartPhoneEx {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("Sharp G", "Black");
		
		System.out.println("Model: " + myPhone.getModel());
		System.out.println("Color: " + myPhone.getColor());
		System.out.println("wifi : " + myPhone.isWifi());
		
		myPhone.bell();
		myPhone.sendVoice("Hello");
		myPhone.receiveVoice("Hi");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
	}
}
