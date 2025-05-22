package week11;

public class Pairi extends Pokemon {
	@Override
	void name() {
		System.out.println("name: Charmander, type: Fire");
	}
	
	@Override
	void attack() {
		System.out.println("Moves: Ember");
	}
	
	@Override
	void passive() {
		System.out.println("Passive: Defence");
	}
}
