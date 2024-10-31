package exam_abstract_class2;

public abstract class MessageSender {
	private String title;
	private String senderName;

	//생성자
	public MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	
	//접근자 설정자
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
 	public String getSenderName() {
		return senderName;
	}
 	public void setSenderNAme(String senderName) {
		this.senderName = senderName;
	}
 	
 	//추상 메서드 생성
	public abstract void sendMessage(String recipient);
	
	//출력문 생성
	public final void sendMessage() {
		System.out.println("제목: 생일을 축하합니다");
		System.out.print("보내는사람: 고객센터 ");
		sendMessage(" ");
	}
	
		
		
	}
	

