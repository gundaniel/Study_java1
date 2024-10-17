package exam_inheritance;

public class Person {
	private String name;
	private int age;

	//null 생성자 
	public Person() {}

	//name 접근자 설정자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//age 접근자 설정자
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//출력 메서드 작성
	public String toString() {
		
		return name + " : " + age;
	}
	
}

