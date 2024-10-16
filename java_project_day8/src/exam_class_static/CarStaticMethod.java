package exam_class_static;

public class CarStaticMethod {
	private int speed;
	private int gear;
	private String color;
	// 실체화된 Car 객체의 개수를 위한 정적 변수
	private static int numberOfCars = 0;

	public CarStaticMethod(int speed, int gear, String color) {
		this.speed = speed;
		this.gear = gear;
		this.color = color;
		++numberOfCars;
	}

	// 정적 메소드. 클래스 메서드
	public static int getNumberOfCars() {
		return numberOfCars;   // 대부분 클래스 필드(정적 필드)를 접근하고 사용.
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "자동차 정보[ 속도 : " + speed + " 기어 : " + gear + " 색상 : " + color + "]";
	}

}