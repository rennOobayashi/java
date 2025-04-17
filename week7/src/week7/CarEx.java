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
		
		//외부 클래스는 반드시 필드값을 객체변수명으로 접근
		myCar.speed = 100;
		System.out.println("Now speed: " + myCar.speed);
		
		Car yourCar = new Car();
		
		System.out.println("--My winter car--");
		System.out.println("Company: " + yourCar.company);
		System.out.println("Model: " + yourCar.model);
		System.out.println("Color: " + yourCar.color);
		System.out.println("Max speed: " + yourCar.maxSpeed);
		System.out.println("Now speed: " + yourCar.speed);
		
		//매개변수를 통해 초기화
		Car myCar2 = new Car("그랜저", "흰", 350);
		
		System.out.println("--My summer car2--");
		System.out.println("Company: " + myCar2.company);
		System.out.println("Model: " + myCar2.model);
		System.out.println("Color: " + myCar2.color);
		System.out.println("Max speed: " + myCar2.maxSpeed);
		System.out.println("Now speed: " + myCar2.speed);
		
		Car yourCar2 = new Car("소나타", "검정", 200);
		
		System.out.println("--My winter car2--");
		System.out.println("Company: " + yourCar2.company);
		System.out.println("Model: " + yourCar2.model);
		System.out.println("Color: " + yourCar2.color);
		System.out.println("Max speed: " + yourCar2.maxSpeed);
		System.out.println("Now speed: " + yourCar2.speed);
		
	}
}
