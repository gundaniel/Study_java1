package exam_interface_cheak;

public class GalaxyMessenger implements Messenger,WorkFile{
	
	
	@Override
	public void setMessage(String msg) {
		System.out.println("galaxy에서 메시지를 설정합니다: " + msg);
	}
	@Override
	public String getMessage() {
		return "galaxy";
	}

	
	public void changeKeyboard() {
		System.out.println("키보드아이콘 터치 후 키보드를 변경합니다");
	}
	
	@Override
	public void fileUpload() {
		System.out.println("file을 업로드합니다");
	}

	@Override
	public void fileDownload() {
		System.out.println("flie을 다운로드 합니다");
	}
	
	
	
	
}
