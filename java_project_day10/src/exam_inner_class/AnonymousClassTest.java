package exam_inner_class;

public class AnonymousClassTest {
	public static void main(String[]args) {
		
		//상위타입		참조변수		상속(구현)받은 추상 or 인터페이스							
		RemoteControl ac = new RemoteControl(){ //무명클래스 선언 인터페이스/ 추상클래스 
			
			//무명 클래스 정의
			@Override
			public void turnOn() {
				System.out.println("TV전원 켜기");
			}
			@Override
			public void turnOff() {
				System.out.println("TV전원 끄기");
			}
			@Override
			public void setVolume(int volume) {}
		};
		
		ac.turnOn();
		ac.turnOff();
	}
}