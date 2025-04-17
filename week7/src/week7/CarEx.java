package week7;

//Execution class
public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//print field's value
		System.out.println("--My summer car--");
		System.out.println("Company: " + myCar.company);
		System.out.println("Model: " + myCar.model);
		System.out.println("Color: " + myCar.color);
		System.out.println("Max speed: " + myCar.maxSpeed);
		System.out.println("Now speed: " + myCar.speed);
		
		Car yourCar = new Car();
		
		
		System.out.println("--My winter car--");
		System.out.println("Company: " + yourCar.company);
		System.out.println("Model: " + yourCar.model);
		System.out.println("Color: " + yourCar.color);
		System.out.println("Max speed: " + yourCar.maxSpeed);
		System.out.println("Now speed: " + yourCar.speed);
	}
}
