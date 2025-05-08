package week10;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setCompany("Honda");
		myCar.setModel("A123");
		myCar.setColor("white");
		myCar.setMaxSpeed(350);
		
		System.out.println("Company : " + myCar.getCompany());
		System.out.println("Model   : " + myCar.getModel());
		System.out.println("Color   : " + myCar.getColor());
		System.out.println("MaxSpeed: " + myCar.getMaxSpeed());
	}

}
