package phoneinfoproject;

class PhoneInfo{
	//필드
	private String name;  // 이름
	private String phoneNumber; // 전화번호

	//생성자
	public PhoneInfo(){ } // 디폴트 생성자
	public PhoneInfo(String name, String phoneNumber){ // 생성자
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	//설정자, 접근자
	public String getName() { // 접근자
		return name;
	}
	public void setName(String name) { //설정자
		this.name = name;
	}
	public String getPhoneNumber() { //접근자
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) { // 설정자
		this.phoneNumber = phoneNumber;
	}

	//출력메서드
	public void showPhoneInfo(){ 
		System.out.println("name: "+ name);
		System.out.println("phone: "+ phoneNumber);
	}
}
	



	

