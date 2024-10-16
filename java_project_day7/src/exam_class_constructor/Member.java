package exam_class_constructor;

public class Member {

	private String name;
	private int age;
	
	//맴버 생성자 실행
	public Member() {
		this("홍길동");
		System.out.println("Member()생성자 실행");
	}
	
	public Member(String name) {
		this(name, 20);
		System.out.println("Member(name)생성자 실행");
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Member(name, age)생성자 실행");
	}
	
	public String toString() {
		return "이름: " + name + "나이: " + age;
	
	}
	
}
