package exam_class_extends;

public class Manager extends Employee{
	private int bonus;
	private String job;
		
	//디폴트 생성자 선언 
	public Manager() {}
	//성성자 선언
	public Manager(String name, String address, String phoneNumber, int salary, int bonus, String job) {
		super(name, address, phoneNumber, salary);
		this.bonus = bonus;
		this.job = job;
	}
	
	//접근자 설정자
 	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	//접근자 설정자
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	//전체 필드를 설정하기 위한 메서드(관리자 정보)
		public void setMgrData(String name, String address, String phoneNumber,int salary, int bonus,String job) {
			//"employee"의 setEmpData로 정의된 필드 설정
			setEmpData(name,address,phoneNumber,salary); //상속
		
			this.bonus = bonus;
			this.job = job;
	}
	
	//출력 메서드
	public String toString() {
		String data = ", job = " + job + ", bonus = " + bonus;
		return super.toString() + data;
	}
		
}
