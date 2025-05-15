package week11;

public class Tetris extends Game {
	public Tetris(String title, String version) {
		super(title, version);
	}
	
	@Override
	public void gameDesc() {
		System.out.println("Tetris is the world famous puzzle game.");
	}
}
