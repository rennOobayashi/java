
public class Car {
	int gas;
	
	public Car() {
	}
	
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public boolean isLeftGas() {
		if (gas > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void run() {
		while (isLeftGas()) {
			System.out.printf("달립니다. (잔량:%d)\r\n", gas);
			--gas;
		}

		System.out.printf("멈춥니다. (잔량:%d)\r\n", gas);
	}
}
