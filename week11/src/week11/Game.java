package week11;

public abstract class Game {
	public String title;
	public String version;
	
	public Game(String _title, String _version) {
		title = _title;
		version = _version;
	}
	
	public void Start() {
		System.out.println("Title: " + title);
		System.out.println("Version: " + version);
		System.out.println("Start " + title + ".");
	}
	
	public abstract void gameDesc();
}
