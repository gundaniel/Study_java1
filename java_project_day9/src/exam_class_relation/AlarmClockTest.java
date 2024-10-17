package exam_class_relation;

public class AlarmClockTest {
	public static void main(String[]args) {
		
		AlarmClock c1 = new AlarmClock();
		System.out.println(c1.toString());
		
		Time alarm = new Time(6,0,0);
		Time current = new Time(12,56,34);
		
		AlarmClock c2 = new AlarmClock(alarm,current);
		System.out.println(c2.toString());

	}
}
