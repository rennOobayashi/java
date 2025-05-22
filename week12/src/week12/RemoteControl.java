package week12;

//모든 구현객체에서 사용하는 기능의 집합
public interface RemoteControl {
	//초기화 필수
	//public static final 생략 가능
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	//public abstract << 생략 가능
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//그대로 사용 가능(Override도 가능)
	default void setMute(boolean mute) {
		if (mute) {
			System.out.printf("Mute - ");
			setVolume(MIN_VALUE);
		}
		else {
			System.out.printf("Unmute - ");
			setVolume(MIN_VALUE);
		}
	}
	
	//필드처럼 구현 클래스 없이 호출 가능
	static void changeBattery() {
		System.out.println("Change Remote control's battery.");
	}
}
