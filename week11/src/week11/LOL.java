package week11;

public class LOL extends Game{

	public LOL(String title, String version) {
		super(title, version);
	}
	
	@Override
	public void gameDesc() {
		System.out.println("LOL is famous MOBA game.");
	}
}
