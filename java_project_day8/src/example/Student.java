package example;

public class Student extends Person {
	private int classnum;
	
	//"classnum" 접근자 설정자
	public int getClassnum() {
		return classnum;
	}
	public void setClassnum(int classnum) {
		this.classnum = classnum;
	}
	
	//생성자 선언
	public Student(String name, int age, int classnum) {
		super(name, age);
		this.classnum = classnum;
	}
	
	//출력 메서드
	@Override
	public String show() {
		return super.show() + ", 학번: " + classnum;
	}
	
	
	
}
