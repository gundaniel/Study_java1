package exam_class_array;

class Car {
	private int speed;    // 속도
	private int gear;     // 기어
	private String color; // 색상
	public int setSpeed;
	
	
	public Car() {
		speed = 80;
        gear = 1;
		color = "red";
	}
	public void carData() {
		speed = 100;
        gear = 5;
		color = "black";
		System.out.format("속도: " + speed + " 기어: " + gear + " 색상: " + color + "\n"); 
	}
	public void speedUp() { // 속도 증가 메소드
		speed += 10;
	}
	public String toString() { // 객체의 상태를 문자열로 반환하는 메소드
		return "속도: " + speed + " 기어: " + gear + " 색상: " + color;
	}
	
}

		//--------------------------------------------- 메인 메서드 선언 
public class CarObjectArray {
	public static void main(String[] args) {
		// 5개의 인스턴스 생성. 각각 생성
		Car c1, c2, c3, c4, c5; // 객체 선언(참조변수선언)
		c1 = new Car();         // 객체 생성(인스턴스생성)
		c2 = new Car();		
		c3 = new Car();
		c4 = new Car();
		c5 = new Car();
		
		// 직접 출력
		System.out.println(c1.toString()); 
		c2.carData();
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c5.toString());
		
		//--------------------------------------------- 배열을 통한 반복선언 
		
		// 객체 배열 생성
		final int NUM_CARS = 15;// 상수 선언
		Car[] cars = new Car[NUM_CARS]; // 객체 배열 선언 = 공간을 받음

		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();        // 객체 생성
			//cars[i].carData();
		}
		for (int i = 0; i < cars.length; i++) {
			cars[i].speedUp();        // 메서드 호출
		}
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println("자동차("+(i+1)+") " + cars[i].toString()); // 필드 출력
		}
	}     
}