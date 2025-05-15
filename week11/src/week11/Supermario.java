package week11;

public class Supermario extends Game {
	public Supermario(String title, String version) {
		super(title, version);
	}
	
	@Override
	public void gameDesc() {
		System.out.println("Super mario is the world famous game, and my favorite game.");
		System.out.println("Happy 40th Anniversary!");
	}
}
