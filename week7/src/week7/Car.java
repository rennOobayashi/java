package week7;

//자동차 객체를 만들기 위한 라이브러리용 클래스
public class Car {
	//field
	String company;
	String model;
	String color;
	int    maxSpeed;
	int    speed;
	
	//생성자 미지정시 자동으로 생김
	//하지만 하나라도 선언시 안생김
	Car() {
		//System.out.println("exe");
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model    = model;
		this.color    = color;
		this.maxSpeed = maxSpeed;
	}
}
