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
	
}
