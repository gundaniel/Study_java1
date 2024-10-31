package exam_interface;

public interface RemoteControl {
		
	//상수
	public static final int MAX_VOLUME = 32;
	int MIN_VOLUME = 0; // "public static final"을 생략가능
	
	//추상 메서드
	public abstract void turnOn();
	public abstract void turnOff();
	
	void setVolume(int volume); // public abstract 생략
	
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다");
		}
		else {
			System.out.println("무음 해제합니다");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
	
	
}

