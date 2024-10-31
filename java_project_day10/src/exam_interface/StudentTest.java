package exam_interface;

import java.util.Arrays;

/*class Student {
	
	//필드
	private String name;
	private int total;
	
	//생성자
	public Student(String name, int total) {
		this.name = name;
		this.total = total;
	}
	
	//접근자
	public String getName() {
		return name;
	}
	public double getTotal() {
		return total;
	}
	
	//출력메서드
	public String toString() {
		return "이름 = " + name + "총점= " + total;
	}
	
	public int compareTo(Object obj) {
		Student student = (Student) obj;
		return this.name.compareTo(student.name);
				}
	
}*/

public class StudentTest{
	public static void main(String[]args) {
		
		//배열 생성
		int[] numbers = {60, 88, 10, 45, 90};
		Arrays.sort(numbers);  // 배열을 작은 수 부터 정렬

		for(int num :numbers) { //"향상된 for"문 사용
			System.out.print(num + " ");
		}
		System.out.println("\n");
		
		Student [] students = new Student[3];
		students[0] = new Student("홍길동", 270);
		students[1] = new Student("이한솔", 290);
		students[2] = new Student("김희진", 210);
		Arrays.sort(students);
		
		for (Student s : students) {
			System.out.println("이름 = " + s.getName() + " 총점 = " + s.getTotal());
		}
	
	}	
	
	
	
	
}

