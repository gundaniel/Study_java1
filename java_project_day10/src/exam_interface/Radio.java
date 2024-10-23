package exam_interface;

public class Radio implements RemoteControl {
	private int rvolume;
	private int rchannel;
	private double rFrequncy;
	
	//라디오의 전원을 켜기 위한 코드 작성
	@Override 
	public void turnOn() {
		System.out.println("라디오 켜기");
	}
	
	//실제로 티비의 전원을 끄기 위한 코드 작성
	@Override
	public void turnOff() {
		System.out.println("라디오 끄기");
	}
	
	@Override
	public void setVolume(int rvolume) {
		if(rvolume > RemoteControl.MAX_VOLUME) {
			this.rvolume = RemoteControl.MAX_VOLUME;
		}
		else if(rvolume < RemoteControl.MIN_VOLUME) {
			this.rvolume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.rvolume = rvolume;
		}
	}		
	public void printChannel() {
		System.out.println("현재 채널은" + rchannel + ", 주파수는 " + rFrequncy + "Mhz입니다");
	}
	
	public String toString() {
		return "현재 라디오 볼륨 :" + rvolume;	
	}

}
