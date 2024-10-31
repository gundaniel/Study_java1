package polymorpism;

//다형성 - 상향 형변환 예제

class A{
	int a = 10;

	void b() {
		System.out.println("A");
	}
}
//------------------------------------------------

class AA extends A{
	
	int a = 20;

	@Override
	void b() {
		System.out.println("AA");
	}
	
	void c() {
		System.out.println("C");
	}
}

//------------------------------------------------
class BB extends A{
	
	int a = 30;
	
	@Override
	void b() {
		System.out.println("BB");
	}
	
	void d() {
		System.out.println("D");
	}
}
//------------------------------------------------

//출력 클래스
public class ClassTest {
	public static void main(String[]args) {
		
		A z= new AA(); 					// A클래스로 상향 형변환
		System.out.println(z.a); 		// A의 값 10
		z.b(); 							// 재정의(오버라이팅)으로 인한 "AA" 출력
		//z.c(); //X
		
		((AA)z).c(); //형변환  			// AA의형변환으로 "C'출력
		System.out.println(((AA)z).a);	// 재정의(오버라이딩)으로 20 출력
		
		AA a1 = (AA) z;
		System.out.println(a1.a); 		// AA의 a값 20 출력
		a1.c();							// AA의 값 C 출력
		
		z = new BB(); 					// 업캐스팅 BB를 A의 타입으로 변환
		System.out.println(z.a); 		// 10
		z.b();							// BB의 b = BB 출력
		//z.d(); //X
		((BB)z).d();					// BB의 d = D 출력
		System.out.println(((BB)z).a);	// 30;
		
		BB b1 = (BB)z;
		b1.d();							// D
		System.out.println(b1.a);		// 30
		

	}
}
