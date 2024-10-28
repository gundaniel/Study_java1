package exam_map;

public class Student {
	//필드
	private int sno;
	private String name;
	//생성자
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	//출력 메서드 선언
	@Override
	public String toString() {
		return " 이름 : " + name + ", 학번 : " + sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return sno == student.sno;
		}
		else {
			return false;
		}
	}
		
	@Override
	public int hashCode() {
		return sno;
	}
	
	
}
