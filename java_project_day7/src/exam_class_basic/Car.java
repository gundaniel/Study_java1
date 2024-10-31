package exam_class_basic;

public class Car { //Car에 대한 정보를 보기위한 클래스 
	
	//필드 정의
	public int speed; //속도 정의 \
	public int gear; // 기어 단수
	public String color; //색
	
	public void carData(int s, int q, String c) {
		speed = s;
		gear = q;
		color =c;
	}
	
	//메서드 정의
	public void speedUP(int s) {					//속도 증가 매서드
		speed += s;
	}
	public void speedDown(int s) { 				// 속도 감소 메서드
		speed -= s;
	}
	public void printData() { 				//객체의 상태를 문자열로 출력 void 사용
		System.out.println("속도: " + speed + " 기어 : " + gear + " 색상: " + color);
	}
	public String toString() { 				//객체의 상태를 문자열로 출력 반환값(return)사용
		return "속도: " + speed + " 기어 : " + gear + " 색상: " + color;
	}
	
}
