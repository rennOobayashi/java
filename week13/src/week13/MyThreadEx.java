package week13;

public class MyThreadEx {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			try {
				MyThread mthread = new MyThread(i);
				mthread.start();
				mthread.join();
			}
			catch (Exception ex){
				System.out.println(ex);
			}
		}
	}

}
