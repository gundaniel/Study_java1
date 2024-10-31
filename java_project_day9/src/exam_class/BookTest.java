package exam_class;

public class BookTest {
	public static void main(String[]args) {

	Magazine mz1 = new Magazine("재미있는 과학잡지 BBC사이언스",119,"BBC 사이언스" ,"2016.08.15");
	Magazine mz2 = new Magazine("엘르 Elle 2023.02월호",250,"Elle" ,"2023.01.08");	
		
		System.out.println(mz1.toString());
		System.out.println();
		System.out.println(mz2.toString());
	}
}