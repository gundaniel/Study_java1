package exam_class_basic;

public class CarTest {
	public static void main(String[]args) {
		
		//클래스명 참조변수 = new 클래스명();
		
		Car myCar = new Car();
		
		//각 필드에 값을 설정하는 방법 참조변수명.필드 = 값;
		//myCar.speed = 5;
		//myCar.color = " black";
		//myCar.gear = 5 ;
		
		myCar.carData(100, 5, "blue"); //carData로 선언
		
		//객체 메소드 호출 - 참조변수명.메서드();
		myCar.speedUP(10);
		myCar.printData();					  //출력방법 예시 1
		System.out.println(myCar.toString()); //출력방법 예시 1
		System.out.println();				  
		
	//-----------------------------------------------------------	
		Car yourCar = new Car();
			
		yourCar.gear = 4;
		yourCar.speed = 80;
		yourCar.color = "navy";
		
		
		yourCar.speedDown(10);
		yourCar.printData();
		System.out.println(yourCar.toString()); //출력방법 예시 1
		System.out.println();					//출력방법 예시 2
	}
}
