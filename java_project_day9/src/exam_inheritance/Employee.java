package exam_inheritance;

public class Employee extends Person{
	private String dept;
	
	public Employee() {
		super();
	}
	
	// 접근자 설정자
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	//출력 메서드 생성
	public String toString() {
		return super.toString() + " : " + getDept();
	}
	
	
	
}
