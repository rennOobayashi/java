package week13;

public class Calculator {
	private int memory;

	//동기화
	public synchronized void setMemory(int memory) {
		try {
			this.memory = memory;
			Thread.sleep(2000);			
		}
		catch (Exception ex) {
			System.out.printf("Error: Calculator (%s)\r\n", ex.getMessage());
		}
		
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
	public int getMemory() {
		return memory;
	}

}
