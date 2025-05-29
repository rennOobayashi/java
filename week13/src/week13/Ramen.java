package week13;

public class Ramen extends Thread {
	String name;
	
	public Ramen(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("o(≧▽≦)o " + name + "さんお水を。");
			Thread.sleep(2000);
			
			System.out.println("(❁´◡`❁) " + name + "さん麺を");
			Thread.sleep(2000);

			System.out.println("╰(*°▽°*)╯ " + name + "さんメロメロイド");
			Thread.sleep(2000);		
		}
		catch (Exception ex) {
			
		}
	}
}
