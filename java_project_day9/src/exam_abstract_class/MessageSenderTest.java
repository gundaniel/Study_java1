package exam_abstract_class;

public class MessageSenderTest {
    public static void main(String args[]) {
        EMailSender email = new EMailSender(
        		"생일을 축하합니다", "고객센터", "admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
        email.sendMessage("javaone@naver.com");
        
        SMSSender sms = new SMSSender(
        		"생일을 축하합니다", "고객센터","02-000-0000", "10% 할인쿠폰이 발행되었습니다.");
        sms.sendMessage("010-000-0000");
        
        // [참고]
        // MessageSender  = new MessageSender();
        // 추상 클래스는 인스턴스를 생성할 수 없다. 추상 메서드를 포함하기 때문에.
    }
}
