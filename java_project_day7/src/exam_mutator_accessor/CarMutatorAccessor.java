package exam_mutator_accessor;

public class CarMutatorAccessor {

	//필드를 정의
	
	private int speed;
	private int gear;
	private String color;
	
	// speed 접근자
	public int getSpeed() {
		return speed;
	}
	// speed 설정자
	public void setSpeed(int speed) {
		if(speed >0) {
		this.speed = speed;
		}
		else {
			speed = 0;
		}
	}
	// gear 접근자
	public int getGear() {
			return gear;
		}
	// gear 설정자
	public void setGear(int gear) {
		this.gear = gear;
		}	
	// color 접근자
	public String getColor() {
		return color;
	}
	// color 설정자
	public void setColor(String color) {
		this.color = color;
	}
		
	public void carData(int speed, int gear, String color) {
		this.speed = speed;
		this.gear = gear;
		this.color = color;
	}
		
	// 메소드 정의
	
	//속도 증가 메서드-------------
	public void speedUp(int s){
		speed += s;
	}
	//속도 감소 메서드-------------
	public void speedDown(int s){
		speed -= s;
	}
	//상태정보 출력
	public String toString() {
		return "자동차 상태정보 [속도: " + speed + " 기어 : " + gear + " 색상: " + color + "]";
	}
			
		
}

