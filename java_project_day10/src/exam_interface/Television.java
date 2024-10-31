package exam_interface;

public class Television implements RemoteControl {
	private int volume;
	private int channel;
	
	@Override 
	//실제로 티비의 전원을 켜기 위한 코드 작성
	public void turnOn() {
		System.out.println("TV 켜기");
	}
	
	@Override
	//실제로 티비의 전원을 끄기 위한 코드 작성
	public void turnOff() {
		System.out.println("TV 끄기");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
	}		

	public void printChannel() {
		System.out.println("현재 채널 선택은" + channel + "번입니다");
	}
	
	public String toString() {
		return "현재 TV 볼륨 :" + volume;
		
	}
	

}

