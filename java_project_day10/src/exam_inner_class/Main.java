package exam_inner_class;

//외부 클래스 구현
class A{
	private int num;
	static int number;
	//-----------------------------------------------------
	A(){
		System.out.println("A객체가 생성됨");
		System.out.println();
	}
	//-----------------------------------------------------
	class B{			//내부클래스(인스턴스 멤버 클래스) - "static"을 가질 수 없음 (17이하버전)
		int field1; 

		B(){
			num = 5;
			number = 3;
			System.out.println("B객체가 생성됨");
		}
		void method1(){
			System.out.println("num: " + num);
			System.out.println("number: " + number);
			System.out.println("field1: " + field1);
		}
	}
	//-----------------------------------------------------
	static class C {	//정적 멤버클래스는 외브클래스의 인스턴스 맴버를 가질 수 없다  //but 정적 맴버는 가능
		int field1;
		static int field2;
		
		C(){	
			number = 9;
			System.out.println("C 객체가 생성됨");	
		}
		
		void method1() {
			System.out.println("field1:" + field1);
		}
		void method2() {
			System.out.println("field2: " + field2);
		}
	}
	//-----------------------------------------------------
	void method() { 	//클래스 D를 로컬클래스로 생성 (메서드 안에서만 사용하기 위한 클래스)
		//내부클래스 - 로컬 클래스
		class D {
			int field3;
			//static int field4;
			D(){
				//field4 =3;
				System.out.println("D객체가 생성됨");
			}
			void method1() {
				System.out.println("field3 : " + field3);
			}
		}
		//메서드 안 
		D d = new D();
		d.field3 = 3;
		d.method1();
	}
} 	//A클래스 종료
	//-----------------------------------------------------
	//실행 main 클래스
public class Main {
	public static void main(String[]args) {
		//인스턴스맴버 객체 생성
		A a = new A(); //외부 클래스 생성
		
		A.B b = a.new B(); //외부 클래스가 먼저 생성되어야 내부 인스턴스 생성가능 
		b.field1 =3;
		b.method1();
		System.out.println();
		
		A.C c = new A.C(); //정적 멤버 클래스 생성
		c.field1 = 3;
		c.method1();
		
		A.C.field2 = 3;
		c.method2();
		System.out.println();
		
		a.method();
		
	}
}
