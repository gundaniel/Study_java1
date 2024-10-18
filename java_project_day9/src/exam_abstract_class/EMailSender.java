package exam_abstract_class;

public class EMailSender extends MessageSender {
    private String senderAddr;
    private String emailBody;
    
    public EMailSender(String title, String senderName, String senderAddr, String emailBody) {
        super(title, senderName); // 부모 클래스의 생성자 호출
        this.senderAddr = senderAddr;
        this.emailBody = emailBody;
    }
    
    @Override
    public void sendMessage(String recipient) { // 추상 메서드 오버라이딩 저장 
        System.out.println("------------------------------");
        System.out.println("제목: " + getTitle());
        System.out.println("보내는 사람: " + getSenderName() + " " + senderAddr);
        System.out.println("받는 사람: " + recipient);
        System.out.println("내용: " + emailBody);
    }
    
    
    //접근자 설정자
	public String getSenderAddr() {
		return senderAddr;
	}
	public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}
	//접근자 설정자
	public String getEmailBody() {
		return emailBody;
	}
	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}
    
}