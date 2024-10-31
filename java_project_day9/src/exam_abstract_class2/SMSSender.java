package exam_abstract_class2;

public class SMSSender extends MessageSender {
	private String phoneNo;
	private String message;
	
	//생성자 생성
	public SMSSender(String title, String name, String phoneNo, String message ) {
		super(title, name);
		this.phoneNo = phoneNo;
		this.message = message;
	}
	
	@Override
	public void sendMessage(String recipienc) {
		System.out.println("\n전화번호: 010-000-0000");
		System.out.println("회신전화번호: " + phoneNo + "\n메세지내용:" + message);
		
	}

}
