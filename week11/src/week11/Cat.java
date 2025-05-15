package week11;

public class Cat extends Animal {
	public Cat() {
		kind = "Honyuurui";
	}
	@Override
	public void sound() {
		System.out.println("Nya Nyann!");
	}
	
	public void catLife() {
		System.out.println("Cat's avg life is 12~15 years.");
	}

}
