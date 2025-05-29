package week13;

public class ThreadP extends Thread{
	private DataBox dataBox;
	
	public ThreadP(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 3; ++i) {
			try {
				String mData = "Data " + i;
				dataBox.setmData(mData);
				sleep(750);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
