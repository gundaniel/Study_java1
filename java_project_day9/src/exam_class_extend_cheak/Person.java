package exam_class_extend_cheak;

public class Person {
	private String name;
	private int age;

	//오버로딩 디폴트 생성자
	public Person() {
		System.out.print("Person 생성자 호출 \n");
	}
	//2개 값 생성자 생성
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.print("Person(name, age) 생성자 호출 \n");
	}

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

