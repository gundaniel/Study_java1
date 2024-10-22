package exam_interface_example;

public class CDInfo {
	private String registerNo;
	private String title;
		
	public CDInfo(String registerNo, String title) {
		this.registerNo =registerNo;
		this.title = title;
	}

	//접근자
	public String getRegisterNo() {
		return registerNo;
	}
	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}
	//설정자
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
