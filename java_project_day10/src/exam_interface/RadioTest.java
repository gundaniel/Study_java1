package exam_interface;

public class RadioTest {
	public static void main(String[]args) {
		
		Radio rd = new Radio();
		rd.turnOn();
		rd.setVolume(20);
		System.out.println(rd.toString());
		rd.printChannel();
		rd.turnOff();
		System.out.println();
	}
}

