package exam_class_extend_cheak;

public class Professor extends Person{
	private String subject;
	
	//default 생성자
	public Professor() {
		System.out.println("Professor 생성자 호출");
	}
	// 3개값 가진 생성자
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		System.out.println("Professor(name, age, subject) 생성자 호출");
		
	}
	
	//접근자 설정자
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	//출력 메서드 작성 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " : " + subject; 
	}
	

	
	
}
