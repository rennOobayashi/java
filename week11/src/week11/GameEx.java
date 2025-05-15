package week11;

public class GameEx {
	public static void main(String[] args) {
		Game[] game = new Game[3];
		game[0] =  new LOL("League of Legend", "v0.1");
		game[1] = new Tetris("Titris 99", "1.0");
		game[2] = new Supermario("Super Mario bros.", "4.0");
	
//		for (int i = 0; i < game.length; ++i) {
//			game[i].Start();
//			game[i].gameDesc();
		for (Game g : game) {
			g.Start();
			g.gameDesc();
			System.out.println();
		}
	}
}
