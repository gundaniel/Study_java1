package exam_class_basic;

public class EmployeeTest {
	public static void main(String[]args) {
		
		Employee emp = new Employee();

		emp.name = "김서건";
		emp.phoneNumber = "010-8297-3315";
		emp.salary = 10000000;
		
		System.out.print(emp.toString());
		System.out.println();
		
		//-------------------------------------------
		
		Employee emp2 = new Employee();  //2번째에 대입	
		
		emp2.employeeData("홍길동","010-1234-5678",30000); // 데이터를 새로 대입
		
		System.out.print(emp2.toString());
		System.out.println();
		
		
		
		
	}
}
