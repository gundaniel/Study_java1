package exam_interface;

public class TelevisionTest {
	public static void main(String[]args) {
		
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(20);
		System.out.println(tv.toString());
		tv.turnOff();
		tv.printChannel();
		System.out.println();
		
		//라디오 클래스 출력-------------------------------------------
		Radio rd = new Radio();
		rd.turnOn();
		rd.setVolume(20);
		System.out.println(rd.toString());
		rd.printChannel();
		rd.turnOff();
		System.out.println();
		//스마트 티비 출력-------------------------------------------
		SmartTelevision smart = new SmartTelevision();
		smart.turnOn();
		smart.search("http://www.naver.com(네이버)");
		smart.turnOff();
	}
}
