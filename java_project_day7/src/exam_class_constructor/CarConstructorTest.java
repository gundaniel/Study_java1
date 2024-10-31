package exam_class_constructor;

public class CarConstructorTest {
	public static void main(String[]args) {
		
	CarConstructor c1 = new CarConstructor(60, 1, "blue");
	System.out.println(c1.toString());
	
	CarConstructor c2 = new CarConstructor();
	System.out.printf("자동차정보 [속도 : %d 기어: %d단 색상: %s]", 
			c2.getSpeed(),c2.getGear(), c2.getColor());
	
		
	}
}
