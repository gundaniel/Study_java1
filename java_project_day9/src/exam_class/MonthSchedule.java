package exam_class;
	
	public class MonthSchedule {
		private int nDays; 
		private Day [] days; // Day 객체 배열
		
		public MonthSchedule(int nDays) {
			this.nDays = nDays;		
			this.days = new Day[nDays];
			for(int i=0; i<days.length; i++) {
				days[i] = new Day();
			}
		}
		
		private void input() {
			System.out.print("날짜(1~31)?");
			int day = MonthScheduleTest.scanner.nextInt();
			System.out.print("할일(빈칸없이입력)?");
			String work = MonthScheduleTest.scanner.next();
			day--;
			
			if(day < 0 || day > nDays) { 
				System.out.println("날짜 잘못 입력하였습니다.!");			
				return;
			}
			days[day].set(work);
		}
		
		private void view() {
			System.out.print("날짜(1~31)?");
			int day = MonthScheduleTest.scanner.nextInt();
			day--;
			if(day < 0 || day > nDays) { 
				System.out.println("날짜 잘못 입력하였습니다.!");			
				return;
			}
			System.out.print((day+1) + "일의 할 일은 " );
			days[day].show();
		}
		
		private void finish() {
			System.out.println("프로그램을 종료합니다.");
		}
		
		public void run() {
			System.out.println("이번달 스케쥴 관리 프로그램.");

			while(true) {
				System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
				int menu = MonthScheduleTest.scanner.nextInt();
				switch(menu) {
				case 1 -> input(); 
				case 2 -> view(); 
				case 3 -> {
					finish();
					return;
				}
				default ->
					System.out.println("잘못입력하였습니다.");
				}
				System.out.println();
			}		
		}

	}
