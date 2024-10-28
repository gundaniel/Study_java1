package exam_queue;

public class Message {
	private String command;
	private String to;
	
	//생성자 생성
	public Message (String command, String to) {
		this.command = command;
		this.to  = to;
	}
	//접근자 설정자 선언
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	


}
