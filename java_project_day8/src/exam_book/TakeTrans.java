package exam_book;

public class TakeTrans {
	public static void main(String[]args) {
		
		Student kim  = new Student("김서건",6,10000);
		Student hong  = new Student("홍길동",4,5000);
		
		Bus bus100  = new Bus(100);
		hong.takeBus(bus100);
		hong.showInfo();
		bus100.busInfo();
		System.out.println("======================================");
		
		//-------------------------------------------------------
		
		Subway green = new Subway("2호선");
		kim.takeSubway(green);
		kim.showInfo();
		green.subInfo();
		System.out.println("======================================");
		
		
	}
}
