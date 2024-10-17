package exam_class_extend_cheak;

public class Employee extends Person{
	private String dept;
	
	//default 생성자 생성
	public Employee() {
		super();
		System.out.println("Employee 생성자 호출");
	}
	//!=default 생성자 생성
	public Employee(String name, int age, String dept) {
		super(name, age); //슈퍼클래스 생성자 호출
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 호출");
	}
	
	// 접근자 설정자
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	//출력 메서드 생성 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " : " + dept;
	}

}
