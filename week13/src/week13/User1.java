package week13;

public class User1 extends Thread {
	Calculator calc = new Calculator();
	
	public User1(Calculator calc) {
		this.calc = calc;
		setName("User1");
	}
	
	//task in thread
	@Override
	public void run() {
		try {
			calc.setMemory(100);
		}
		catch (Exception ex) {
			System.out.printf("Error Uesr1 (%s)", ex.getMessage());
		}
	}
}
