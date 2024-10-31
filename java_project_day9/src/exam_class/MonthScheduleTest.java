package exam_class;

	import java.util.Scanner;

	public class MonthScheduleTest {
		public static Scanner scanner = new Scanner(System.in);	
		
		public static void main(String[] args) {
			MonthSchedule october = new MonthSchedule(31); // 10월달의 할 일
			october.run();
		}
	}

