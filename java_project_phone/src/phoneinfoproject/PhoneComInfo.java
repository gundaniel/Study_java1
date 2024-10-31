package phoneinfoproject;


public class PhoneComInfo extends PhoneInfo{
	//필드
	private String company;

	//생성자
    public PhoneComInfo(String name, String phoneNumber, String company){
        super(name, phoneNumber);
        this.company=company;
    }

    //설정자 접근자
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    //출력메서드
    @Override
    public void showPhoneInfo(){
        super.showPhoneInfo();
        System.out.println("company: "+company);
    }
}


	