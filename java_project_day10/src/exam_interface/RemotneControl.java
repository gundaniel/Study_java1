package exam_interface;

public interface RemotneControl {
		
	//상수
	public static final int MAX_VOLUME = 32;
	int MIN_VOLUME = 0; // "public static final"을 생략가능
	
	//추상 메서드
	public abstract void turnOn();
	public abstract void turnOff();
	
	void setVolume(int volume); // public abstract 생략
}

