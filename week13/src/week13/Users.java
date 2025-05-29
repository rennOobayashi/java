package week13;

public class Users extends Thread {
	private Calculator calc = new Calculator();
	private String name;
	private int memory = 0;
	
	public Users(String name, Calculator calc, int memory) {
		this.calc = calc;
		this.name = name;
		setName(this.name);
		
		this.memory = memory;
	}
	
	public int getMemory() {
		return this.memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	//task in thread
	@Override
	public void run() {
		try {
			calc.setMemory(this.memory);
		}
		catch (Exception ex) {
			System.out.printf("Error %s (%s)", this.name, ex.getMessage());
		}
	}
}
