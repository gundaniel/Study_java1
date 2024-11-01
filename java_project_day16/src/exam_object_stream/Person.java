package exam_object_stream;

import java.io.Serializable;
/*
Person 클래스를 캡슐화(EnCapsulation) 원칙에 맞춰서 구현하시오.

- 직렬화 선언한다.
- String타입의 name과 int타입의 age 필드를 선언한다
- 기본생성자와 매개변수 있는 생성자를 작성한다.
- 필드에 대한 getter 와 setter 작성한다.
- toString() 메소드를 오버라이딩하여 인스턴스변수의 값에 대한 문장을 작성하여 리턴한다.
*/

public class Person implements Serializable {
	//UID 추가
	private static final long serialVersionUID = 1L;
	//필드
	private String name;
	private int age;
	//생성자 
	public Person() {}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//접근자 설정자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//출력메서드
	@Override
	public String toString() {
		return "이름 : " + name + "나이 : " + age;		
	}
	
}
