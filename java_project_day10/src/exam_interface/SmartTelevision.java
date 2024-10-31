package exam_interface;

public class SmartTelevision implements RemoteControl, Searchable{

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("SmartTelevision 켜기");
	}
	
	@Override
	public void turnOff() {
		System.out.println("SmartTelevision 끄기");	
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
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public String toString() {
		return "현재 TV 볼륨 : " + volume;
	}
}
