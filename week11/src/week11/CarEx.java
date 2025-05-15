package week11;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		car.tire = new Tire();
		car.run();
		
		car.tire = new KoreaTire();
		car.run();
		
		car.tire = new HirokaneTire();
		car.run();
	}
}
