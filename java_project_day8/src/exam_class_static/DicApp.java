package exam_class_static;
import java.util.Scanner;
public class DicApp {
	
	 /*[실행 예시]

	한영 단어 검색 프로그램입니다. [종료입력]
	한글 단어?사랑
	사랑은 love
	한글 단어?공부
	공부는 저의 사전에 없습니다.
	한글 단어?종료
	단어 검색을 종료합니다
	*/		
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.[종료입력]");
		
		while(true) {
			System.out.print("한글 단어?");
			String kor = scanner.next();
			if(kor.equals("종료")) {
				break;
			}
			
			String eng = Dictionary.stringInput(kor);
			if(eng == null)
				System.out.println(kor + "는 저의 사전에 없습니다.");
			else {
				System.out.println(kor + "은 " + eng);				
			}
		}														 //while문 종료
		System.out.println("단어 검색을 종료합니다.");
		scanner.close();
	}

}
