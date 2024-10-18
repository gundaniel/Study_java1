package exam_abstract_class2;

public class MessageSenderTest {
	public static void main(String[]args) {
		
		EMailSender es = new EMailSender("생일을 축하합니다","고객센터","javaone@naver.com","10%%쿠폰이 발행되었습니다");
		SMSSender ss = new SMSSender("생일을 축하합니다","고객센터","02-000-0000","10%%쿠폰이 발행되었습니다");
			
			System.out.println("----------------------");
			es.sendMessage();
			System.out.println("----------------------");
			ss.sendMessage();
		
	}

}
