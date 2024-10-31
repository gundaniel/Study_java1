package exam_class_constructor;

public class CarConstructor {

	private int speed;
	private int gear;
	private String color;
	
	//생성자1
	public CarConstructor() {
		this(0,1,"red");
	}
	
	//생성자2
	public CarConstructor(int speed, int gear, String color) {
		this.speed = speed;
		this.gear = gear;
		this.color = color;	
	}
	
	//접근자 생성
	public int getSpeed() {
		return speed;
	}
	public int getGear() {
		return gear;
	}
	public String getColor() {
		return color;
	}
	
	//출력메서드 생성
	public String toString() {
		return "자동차정보 [속도: " + speed + " 기어: " + gear + "단 색상: " + color +  "]";	
	}

}
