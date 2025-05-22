package week11;

public class Purin extends Pokemon {
	@Override
	void name() {
		System.out.println("name: Jigglytuff, type: Normal");
	}
	
	@Override
	void attack() {
		System.out.println("Moves: Sing");
	}
	
	@Override
	void passive() {
		System.out.println("Passive: Evasion");
	}
}
