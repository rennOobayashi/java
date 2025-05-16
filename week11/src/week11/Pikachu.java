package week11;

public class Pikachu extends Pokemon {
	@Override
	void name() {
		System.out.println("name: Pikachu, type: Electric");
	}
	
	@Override
	void attack() {
		System.out.println("Moves: ThunderBolt");
	}
	
	@Override
	void passive() {
		System.out.println("Passive: Speed");
	}
}
