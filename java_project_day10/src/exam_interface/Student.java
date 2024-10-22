package exam_interface;
@SuppressWarnings("rawtypes")
public class Student implements Comparable{

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
		
		
}
	
	

