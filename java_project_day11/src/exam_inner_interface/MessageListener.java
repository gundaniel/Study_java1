package exam_inner_interface;

public class MessageListener implements Button.OnClickListener { //구현 클래스
	
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다");
	}
}
