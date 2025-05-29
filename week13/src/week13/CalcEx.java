package week13;

public class CalcEx {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Users user1 = new Users("User1", calc, 100);
		Users user2 = new Users("User2", calc, 0);
		
		user1.start();
//		try {
//			Thread.sleep(50);
//		}
//		catch (Exception ex) {
//			System.out.println(ex);
//		}
		user2.setMemory(50);
		user2.start();
	}

}
