package exam_class_relation;

public class AlarmClock {
	 // has -a 성립 // 접근제어자 클래스 Time 객체 참조변수
	private Time currentTime; 
	private Time alarmTime;

	//생성자 생성
	public AlarmClock() {
		alarmTime = new Time(5,30,0); 
		currentTime = new Time(15,0,0); 
	}
	//생성자 두번째 생성
	public AlarmClock(Time a, Time c) {
		alarmTime = a;
		currentTime = c;
	}
	
	//출력 메서드
	public String toString() {
		//"Time"의 toString을 사용
		return "AlarmClock [alarm: " + alarmTime.toString()
		+ "current: " + currentTime.toString();
			
	}
	
	
}