package week11;

public class Dog extends Animal{

	public Dog() {
		kind = "Honyuurui";
	}
	@Override
	public void sound() {
		System.out.println("Wann Wann!");
	}
	
	public void dogLife() {
		System.out.println("Dog's avg life is 15~20 years.");
	}
}
