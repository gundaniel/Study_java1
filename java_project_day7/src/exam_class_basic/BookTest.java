package exam_class_basic;

public class BookTest {
	public static void main(String[]args) {
		
		
		 Book HowCanTheyLiveIt = new Book();
		 
		 HowCanTheyLiveIt.title = "그대들,어떻게 살것인가";
		 HowCanTheyLiveIt.writer = "요시노 겐자부로";
		 HowCanTheyLiveIt.price = 10800;
		 HowCanTheyLiveIt.genre = "교양인문";
		 
		 System.out.print(HowCanTheyLiveIt.toString()); //toString으로 출력
		 System.out.println("\n");
		 
		 //---------------------------------------------------------
		 
		 Book knockofsuzume = new Book(); //2번째 선언
		 
		 // 스즈메의 문단속
		 // 신카이 마코토
		 // 11,700원
		 // 일본소설	
		 
		 knockofsuzume.bookData("스즈메의 문단속", "신카이 마코토", 11700, "일본소설"); 
		 knockofsuzume.printData(); // 데이터를 출력
		
	}

}
