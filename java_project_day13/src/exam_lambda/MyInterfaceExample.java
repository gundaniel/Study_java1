package exam_lambda;


interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface{
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}
class MyClass2 implements MyInterface{
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}

public class MyInterfaceExample { 
	public static void test(MyInterface mi) { //인터페이스로 구현된 클래스
		mi.print();	
	}
	
	public static MyInterface test2() { //무명 클래스
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {				
			System.out.println("test2()메서드에서 반환된 MyInterFace");
			}
		};
		return mi;
	}
	public static MyInterface test3() {
		return new MyInterface() {			
			@Override
			public void print() {
				System.out.println("test3()메서드로 MyInterface 인스턴스 반환");
			}
		};	
	}	
		
	public static void main(String[]args) {		
	MyClass1 mc1 = new MyClass1();
	MyClass2 mc2 = new MyClass2();
	mc1.print();
	mc2.print();
	System.out.println("================================");
	
	MyInterface mi = () -> System.out.println("람다식으로 구현"); //함수형 프로그래밍 = 람다식으로 표현
		/*new MyInterface() {	 
		@Override
		public void print() { //print 재정의
			System.out.println("익명 클래스로 구현");
		}
	};*/
	mi.print(); 
	
	test(mc1);
	test(mi);
	System.out.println("================================");
	
	(new MyInterface() {
		@Override
		public void print() {
			System.out.println("선언, 생성, 호출을 한번에 처리");
		}
	}).print(); //선언, 생성, 호출을 한번에 처리
	System.out.println("================================");

	MyInterface mi2 = test2();
	mi2.print();
	System.out.println("================================");

	MyInterface mi3 = test3(); //메서드에서 반환된 MyInterface로 구현한 (익명)클래스의 참조값(주소값)
	mi3.print();
	System.out.println("================================");

	}
}
