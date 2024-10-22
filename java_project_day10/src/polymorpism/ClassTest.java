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
		z.b(); 							// 재정의로 인한 AA 출력
		//z.c(); //X
		
		((AA)z).c(); //형변환  			// 형변환으로 C출력
		System.out.println(((AA)z).a);	// 재정의(오버라이딩)으로 20 출력
		
		AA a1 = (AA) z;
		System.out.println(a1.a); 		// 20
		a1.c();							//C
		
		z = new BB(); 
		System.out.println(z.a); 		//재정의 30
		z.b();
		//z.d(); //X
		((BB)z).d();
		System.out.println(((BB)z).a);
		
		BB b1 = (BB)z;
		b1.d();
		System.out.println(b1.a);
		

	}
}
