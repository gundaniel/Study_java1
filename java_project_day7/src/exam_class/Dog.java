package exam_class;

public class Dog {
	
	/* 강아지를 나타내는 Dog이라는 이름의 클래스를 설계한다. 
	 * Dog 클래스는 강아지의 이름(name) 강아지의 종류(breed) 
	 * 예를 들어 "요크셔테리어", 강아지의 나이(age)를 필드로 가진다.
	 * 생성자 및 설정자, 접근자를 생성하여 보자. 
	 */
	
	// 필드 선언: 접근제한자(제어자) 자료형 변수
		private String name;
		private String breed;
		private int age;
		
		// 생성자: 접근제한자(제어자) 클래스명(){ }
		public Dog() { }
		public Dog(String name, int age){
			//this.name = name;
			//this.age = age;
			this(name, "", age);
		}
		public Dog(String name, String breed, int age){
			this.name = name;
			this.breed = breed;
			this.age = age;
		}
		// 메서드 선언
		// 접근자: 접근제한자(제어자) 자료형 get+필드명() { return 필드값; }
		public String getName() {
			return name;
		}
		// 설정자: 접근제한자(제어자) void set+필드명(자료형 변수) { this.필드명 = 변수; }
		public void setName(String name) {
			this.name = name;
		}
		
		public String getBreed() {
			return breed;
		}
		
		public void setBreed(String breed) {
			this.breed = breed;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public String toString(){
			return String.format("나의 반려견[이름:%s, 종류:%s, 나이:%d]", name, breed, age);
		}
	}