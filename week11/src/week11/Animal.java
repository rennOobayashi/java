package week11;

//abstract class(instance X, extends O)
public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("Breathing.");
	}
	
	//Override required.
	public abstract void sound();
}
