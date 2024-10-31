package exam_class_extends;

public class Employee {
	private String name;
	private String address;
	private String phoneNumber;
	private int salary;
	
	//생성자 선언
	public Employee(){}
	
	//생성자 선언
	public Employee (String name, String adress, String phoneNumber, int salary) {
		this.name = name;
		this.address  = adress;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	
	//접근자 설정자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//접근자 설정자
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//접근자 설정자
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	//접근자 설정자
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//전체 필드를 설정하기 위한 메서드
	public void setEmpData(String name, String address, String phoneNumber,int salary) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	//출력 메서드
	public String toString() {
		return "사원명 = " + name + ", 사원주소= " + address + ", 전화번호: "
	+ phoneNumber + ", 월급 " + salary;
	}



}
