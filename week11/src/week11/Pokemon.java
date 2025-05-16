package week11;

public abstract class Pokemon {
	public void introduce() {
		name();
		attack();
		passive();
		System.out.println();
	}
	
	abstract void name();
	abstract void attack();
	abstract void passive();	
}
