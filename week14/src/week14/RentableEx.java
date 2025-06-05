package week14;

public class RentableEx {
	public static void main(String[] args) {
		HouseAgency ha = new HouseAgency();
		House sweetHome = ha.rent();
		sweetHome.turnOnLight();
		
		CarAgency ca = new CarAgency();
		Car sweetCar = ca.rent();
		
		sweetCar.Running();
		
		ToyAgency ta = new ToyAgency();
		Toy nintendo = ta.rent();
		
		nintendo.Play();
	}
}
