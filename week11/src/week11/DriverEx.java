package week11;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle v = new Vehicle();
		driver.drive(v);
		
		Bus b = new Bus();
		driver.drive(b);

		driver.drive(new Texi());
	}
}
