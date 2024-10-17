package simplephoneinfo;

public class PhoneInfo {

	private String name;
	private String phoneNumber;
	private String birthday;
	
	//name 접근 생성자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//phonenumber 접근 생성자
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	//birthday 접근 생성자
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	//두개의 변수 저장
			public PhoneInfo(String name,String phoneNumber) {
				this(name, phoneNumber, null);
			}
	
	//세개의 변수 저장
	public PhoneInfo(String name,String phonenumber, String birthday) {
		this.name  = name;
		this.phoneNumber = phonenumber;
		this.birthday  = birthday;
	}
	//출력
	public void showPhoneInfo() {
		 System.out.println("name: " + name); 
		 System.out.println("phone: " + phoneNumber);
		if(birthday != null) {
			 System.out.println("birth: "  + birthday);
		 }
			 System.out.println();			
		 }
	}	

	

