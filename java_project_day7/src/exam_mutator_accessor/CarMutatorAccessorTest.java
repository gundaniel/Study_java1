package exam_mutator_accessor;

public class CarMutatorAccessorTest {
	public static void main(String[]args) {
		
		CarMutatorAccessor myCar = new CarMutatorAccessor();
		
		//설정자 메서드 호출
		
		myCar.setSpeed(100);
		myCar.setGear(5);
		myCar.setColor("red");
		
		//접근자 메서드 호출
		
		System.out.println("===접근자 메서드 호출로 필드 출력 ===");
		System.out.println("현재 자동차의 색상: " + myCar.getColor());
		System.out.println("현재 자동차의 속도: " + myCar.getSpeed());
		System.out.println("현재 자동차의 단수: " + myCar.getGear());
		
		System.out.println("===접근자 메서드 호출로 필드 출력 ===");
		System.out.println(myCar.toString());
		
	}
}
