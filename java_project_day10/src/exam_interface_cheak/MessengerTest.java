package exam_interface_cheak;

public class MessengerTest {
	public static void main(String[]args) {
		
		//인터페이스는 인스턴스를 생성할 수 없음
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("메신저 최소 문자크기" + Messenger.MIN_SIZE); //인터페이스.상수명
		System.out.println("메신저 최대 문자크기" + Messenger.MAX_SIZE);

		iphone.setLogin(true);
		System.out.println(iphone.getMessage());
		iphone.setMessage("Hello");
		iphone.clearMessage();
		
		iphone.drow_textBook();
		iphone.drow_textBook();
		
		iphone.setLogin(false);
		System.out.println("========================");
		

		//갤럭시
		galaxy.setLogin(true);	
		System.out.println(galaxy.getMessage());
		galaxy.setMessage("안녕");
		galaxy.changeKeyboard();
	
		galaxy.fileUpload();
		galaxy.fileDownload();
		galaxy.setLogin(false);	

	}
}
