package example;

public class ForeignStudent extends Student {
	private String from;
	
	//생성자 선언
	public ForeignStudent(String name, int age, int classnum, String from) {
		
		super(name, age, classnum);
		this.from = from;
	}
	
	//from 접근자 설정자 선언
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	
	//출력 메서드
	public String show() {
		return super.show() + "국적: " + from;
	}

}
