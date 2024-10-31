package exam_class_extends;

public class EmployeeTest {
	public static void main(String[] args) {
		// 실행결과 1
		/*Employee emp1 = new Employee();
		emp1.setEmpData("김철수", "서울시 영등포구 당산6가", "010-2353-3245", 1500000);
		System.out.println(emp1.toString());
		
		Manager mgr1 = new Manager();
		mgr1.setMgrData("홍길동",  "서울시 성동구 ", "010-7869-0987",2000000, "대리", 100000);
		System.out.println(mgr1.toString());
		System.out.println();*/
		
		// 실행결과 2
		Employee emp2 = new Employee("김철수", "서울시 영등포구 당산6가", "010-2353-3245", 1500000);
		System.out.println(emp2.toString());
		
		Manager mgr2 = new Manager("홍길동",  "서울시 성동구 ", "010-7869-0987",2000000, 100000, "대리");
		System.out.println(mgr2.toString()); 
		System.out.println();
		
	}
}
