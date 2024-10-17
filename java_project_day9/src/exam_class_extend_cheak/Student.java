package exam_class_extend_cheak;

public class Student extends Person {
	private String major;
	
	//default 생성자
	public Student() {
		System.out.println("Student 생성자 호출");
	}
	//3개값 생성자 생성
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		System.out.println("Student(name, age, major) 생성자 호출");
	}
	
	//접근자 설정자 생성
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	// 출력메서드 생성 (오버라이딩)
	@Override
	public String toString() {
		return super.toString() + " : " +  major;
	}

}
