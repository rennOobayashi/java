package week7;

public class CarEx2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("그랜저");
		Car c3 = new Car("소나타", "흰");
		Car c4 = new Car("아반테", "네이비", 250);
		
		System.out.printf("c1: %10s %9s %5s %03d %03d\r\n", c1.company, c1.model, c1.color, c1.maxSpeed, c1.speed);
		System.out.printf("c2: %10s %9s %5s %03d %03d\r\n", c2.company, c2.model, c2.color, c2.maxSpeed, c2.speed);
		System.out.printf("c3: %10s %9s %5s %03d %03d\r\n", c3.company, c3.model, c3.color, c3.maxSpeed, c3.speed);
		System.out.printf("c4: %10s %9s %5s %03d %03d\r\n", c4.company, c4.model, c4.color, c4.maxSpeed, c4.speed);
	}
}
