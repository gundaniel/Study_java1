package exam_inheritance;

public class InheritanceTest {
	public static void main(String[]args) {
		
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
		
		
		e.setName("홍길동");
		e.setAge(47);
		e.setDept("행정지원팀");

		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("데이터베이스");

		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("자바 프로그래밍 과정");

		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}

}
