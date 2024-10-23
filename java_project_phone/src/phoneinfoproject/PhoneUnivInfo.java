package phoneinfoproject;

public class PhoneUnivInfo extends PhoneInfo{
	//필드
	private String major;
	private int year;
	//생성자
	public PhoneUnivInfo(String name, String phoneNumber, String major, int year){
		super(name, phoneNumber);
		this.major=major;
		this.year=year;
	}
	//설정자 접근자
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//출력 메서드
	@Override
	public void showPhoneInfo(){ //상속 후 재정의 메서드
		super.showPhoneInfo();
		System.out.println("major: "+ major);
		System.out.println("year: "+ year);
	}
}