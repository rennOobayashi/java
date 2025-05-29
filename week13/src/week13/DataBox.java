package week13;

public class DataBox extends Thread{
	private String mData;

	public synchronized String getmData() throws InterruptedException {
		//mData == null > error
		if (mData == null) {
			wait();
		}
		String returnValue = mData;
		System.out.println("Read " + returnValue);
		mData = null;
		
		notify();
		
		return returnValue;
	}

	public synchronized void setmData(String mData) throws InterruptedException {
		//only mData == null
		if (this.mData != null) {
			wait();
		}
		
		this.mData = mData;
		System.out.println("Write " + mData);
		
		notify();
	}
	
	
}
