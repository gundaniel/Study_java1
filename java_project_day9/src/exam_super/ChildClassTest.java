package exam_super;

class ParentClass{
	protected int data;
	
	// 부모클래스의 생성자 선언
	public ParentClass() {
		data = 100;
	}
	// 부모 클래스의 print = 100
	public void print() {
		System.out.println("수퍼 클래스의 print() 메서드");
	}
}
//-------------------------------------------------------
class ChildClass extends ParentClass{
	protected int data;
	
	// 자식 클래스의 생성자 선언 = 200
	public ChildClass() {
		data = 200;
	}
	
	@Override // 어노테이션
	public void print() {
		int data = 300;										// data 값 변경 = 300
		super.print(); 										// 부모클래스의 print 출력
		System.out.println("서브 클래스의 print() 메서드"); 
		System.out.println("data: " + data); 				// 지역변수의 data 값 출력
		System.out.println("this.data: " + this.data);		// 현재 클래스의 data 값 출력
		System.out.println("super.data: " + super.data);	// 부모 클래스의 data 값 출력
	}
}
//-------------------------------------------------------

public class ChildClassTest {
	public static void main(String[]args) {
		ChildClass obj = new ChildClass(); 		// 인스턴스 생성
		obj.print();							// 출력
	}

}
