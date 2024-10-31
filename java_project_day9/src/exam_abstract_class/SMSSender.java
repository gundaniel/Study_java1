package exam_abstract_class;

public class SMSSender extends MessageSender {
	private String returnPhoneNo;
	private String message;
    
	public SMSSender(String title, String senderName, String returnPhoneNo, String message) {
        super(title, senderName);
        this.returnPhoneNo = returnPhoneNo;
        this.message = message;
    }
    
	@Override
	public void sendMessage(String recipient) {
        System.out.println("------------------------------");
        System.out.println("제목: " + getTitle());
        System.out.println("보내는 사람: " + getSenderName());
        System.out.println("전화번호: " + recipient);
        System.out.println("회신 전화번호: " + returnPhoneNo);
        System.out.println("메시지 내용: " + message);
    }

	public String getReturnPhoneNo() {
		return returnPhoneNo;
	}

	public void setReturnPhoneNo(String returnPhoneNo) {
		this.returnPhoneNo = returnPhoneNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
