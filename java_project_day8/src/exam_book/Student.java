package exam_book;

public class Student {
	
	//필드 선언
	private String student;
	private int grade;
	private int money;
	
	//생성자 선언
	public Student() {}
	//3개 생성자 선언
	public Student(String s,int g, int m) 
	{
		student = s;
		grade = g;
		money = m;	
	}
	
	//student 접근자 설정자
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	//grade 접근자 설정자
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	// money 접근자 설정자
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	//버스 메서드 생성
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	//지하철 메서드 생성
	public void takeSubway(Subway subway) {
		subway.take(1500);
		money -= 1500;
		
	}
	
	//출력 메서드 생성
	public void showInfo() {
		System.out.printf("%s학년 %s님의 남은 돈은 %,d원입니다.\n", grade, student, money);
	}
	
	
	
	
}
