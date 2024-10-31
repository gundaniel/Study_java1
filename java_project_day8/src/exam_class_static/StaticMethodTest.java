package exam_class_static;

public class StaticMethodTest {
	private static int num1 = 5;
	private int num2 = 3;
	
	public static void print1() {
		int num3 = num1;
		//int num4 = this.num2;  // "static"메서드안 this 사용불가 (인스턴스의 주소값을 가르킴)
		System.out.println(num3);
		System.out.println("print1() 호출");
	}
	
	public void print2() {
		int num3 = num1;
		int num4 = num2;
		System.out.println(num3 + "," + num4);
		System.out.println("print2() 호출");
	}
	
	public static void main(String[]args) {
		StaticMethodTest.print1();
		print1();
		
		//staticMethodTest.print2();
		//print2()
		
		StaticMethodTest method = new StaticMethodTest();
		method.print2();
		
		
	}
	
	
	
}
