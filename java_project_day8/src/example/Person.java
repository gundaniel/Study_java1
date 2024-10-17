package example;

public class Person {
	private String name;
	private int age;
	
	
	//생성자 선언
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// name 접근자 설정자 선언
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	//Person 접근자 설정자 선언
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//출력 메서드
	public String show() {
		return "이름 : " + name + "나이 : "+ age;
	}
}
