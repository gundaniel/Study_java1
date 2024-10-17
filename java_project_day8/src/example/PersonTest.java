package example;

public class PersonTest {
	public static void main(String[]args) {
	
	Person ps = new  Person("홍길동, ",56);
	Student st = new Student("한늘봄, ",41,99010001);
	ForeignStudent fs = new  ForeignStudent("Olivia, ",39 ,97060004,"USA");
	
		System.out.println("사람[" + ps.show() + "]");
		System.out.println("학생[" + st.show() + "]");
		System.out.println("외국학생[" + fs.show()+ "]");
		
	}
	
}
