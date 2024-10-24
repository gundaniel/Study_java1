package exam_multi_type_parameter;

public class SmartPhone{
	private String company;
	private String os;
	
	//생성자 선언
	public SmartPhone() {}
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	public String toString() {
		return "[" + company + ", " + os + "]" ;
	}
}
