package exam_class_basic;

public class Employee {

	//직원정보정보 소스파일
	
	public String name;
	public String phoneNumber;
	public int salary = 0;
	
	public void employeeData(String eName, String pNumber, int sal ) {	
		name = eName;
		phoneNumber = pNumber;
		salary = sal;
	}
	
	public String toString(){
		//return "직원정보 [사원명= " + name + " 전화번호= " + phoneNumber + " 급여= " + salary + "]";
		return String.format("직원정보 [사원명= %s 전화번호= %s 급여=%,d]",name, phoneNumber, salary);	 //"printf"와 형식이 동일
	}  //"fotmat"은 숫자출력시 ","로 천단위 콤마표현 가능
	
}
