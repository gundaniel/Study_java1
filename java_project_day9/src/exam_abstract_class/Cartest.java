package exam_abstract_class;

public class Cartest {
	public static void main(String[]args) {
		
		System.out.println("=== 자율주행하는 자동차 ===");
		AICar mycar = new AICar();
		mycar.run();		
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		ManualCar hiscar = new ManualCar();
		hiscar.run();
		
	}
	
	
}
