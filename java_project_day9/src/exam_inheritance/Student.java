package exam_inheritance;

public class Student extends Person {
	private String major;
	
	//접근자 설정자 생성
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	// 출력메서드 생성
	public String toString() {
		return super.toString() + " : " + getMajor();
	}

}
