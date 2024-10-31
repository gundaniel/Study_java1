package exam_inheritance;

public class Professor extends Person{

	
	private String subject;

	//접근자 설정자
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return super.toString() + " : " + getSubject(); 
	}
	
	
	
	
	
	
}
