package exam_inner_class;

interface Messenger {
	public abstract String getMessage();
	public abstract void setMessage(String msg);
}

public class MessengerTest{
	public static void main(String[]args) {
		
		Messenger test = new Messenger() { // 무명클래스(인터페이스) 선언

			@Override
			public String getMessage() {
				return "점심 맛있게 드세요";
			}
			@Override
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다."+ msg);
			}
			
		};
			System.out.println(test.getMessage());
			test.setMessage("\"have a nice day\""); // \"사용으로 쌍따옴표 출력
			
		}
	}
	



