package week10;

class AirLine {
	public AirLine() { }
	
	public void takeOff() {
		System.out.println("Take off.");
	}
	
	public void fly() {
		System.out.println("Flying.");
	}
	
	public void land() {
		System.out.println("Land.");
	}	
}

public class AirCraft extends AirLine {
	@Override
	public void fly() {
		System.out.println("AirLine flying.");
//		super.fly();
	}
	
	public static void main(String[] args) {
		AirCraft air = new AirCraft();
		
		air.takeOff();
		air.fly();
		air.land();
	}
}
