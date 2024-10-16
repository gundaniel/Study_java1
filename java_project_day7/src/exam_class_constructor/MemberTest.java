package exam_class_constructor;

public class MemberTest {
	public static  void main(String[]args) {
		
		System.out.println("main()메서드 실행");
		
		Member m1 = new Member();
		System.out.println(m1.toString());
		System.out.println();
		
		Member m2 = new Member("김철수");
		System.out.println(m1.toString());
		System.out.println();
		
		Member m3 = new Member("김영희",25);
		System.out.println(m1.toString());
		System.out.println();
		
	}
}
