package exam_abstract_class2;

public class EMailSender extends MessageSender {
	private String emailAd;
	private String emailBody;
	
	//생성자 생성
	public EMailSender(String title, String name,String emailAd, String emailBody) {
		super(title, name);
		this.emailAd = emailAd;
		this.emailBody = emailBody;
	}
	//접근자 설정자
	public String getEmailAd() {
		return emailAd;
	}
	public void setEmailAd(String emailAd) {
		this.emailAd = emailAd;
	}
	//접근자 설정자
	public String getEmailBody() {
		return emailBody;
	}
	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	@Override
	public void sendMessage(String recipient) {
		System.out.println("admin@duckeeshop.co.kr");
		System.out.println("받는사람: " + emailAd + "\n내용:" + emailBody);
		
	}

}