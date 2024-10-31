package exam_class_basic;

public class EmployeeTest {
	public static void main(String[]args) {
		
		//직원의 정보를 출력하는 소스파일  = 실행하는 클래스
		
		Employee emp = new Employee();

		emp.name = "김서건";
		emp.phoneNumber = "010-8297-3315";
		emp.salary = 10000000;
		
		System.out.print(emp.toString()); //->"return"값이 출력됨
		System.out.println();
		
		//-------------------------------------------
		
		Employee emp2 = new Employee();  //2번째에 대입	
		
		emp2.employeeData("홍길동","010-1234-5678",30000); // 기존데이터를 새로 대입 -> 순서대로 입력
		
		System.out.print(emp2.toString());
		System.out.println();
		
		//-------------------------------------------
		
		Employee emp3 = new Employee();  //3번째에 대입	
		
		emp3.employeeData("장문복","010-5678-1234",300000000); // 데이터를 새로 대입
		
		System.out.print(emp3.toString());
		System.out.println();
	}
}
