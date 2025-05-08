package week10;

public class SonicAirplane extends Airplane {
	//public static final int STOP = 0;
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	private int flyMode = NORMAL;
	private int soundSpeed;
	private int maxSpeed;
	
	public SonicAirplane() {
		// TODO Auto-generated constructor stub
	}
	
	public SonicAirplane(int soundSpeed, int maxSpeed) {
		this.soundSpeed = soundSpeed;
		this.maxSpeed = maxSpeed;
	}
	
	public void ChangeFlyMode() {
		System.out.println("Change fly mode.");
		if (flyMode == NORMAL) {
			flyMode = SUPERSONIC;
		}
		else {
			flyMode = NORMAL;
		}
	}

	public int getSoundSpeed() {
		return soundSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("SONIC flying.");			
		}
		else if (flyMode == NORMAL) {
			super.fly();
		}
//		else {
//			land();
//		}
	}
	
	
}
