package example;
import java.util.Scanner;
public class ScoreArray {
	public static void main(String[]args) {
		
		//과목명과 맞게 점수를 출력 ,과목명은 대소문자 구별
		//Java = 95 ,데이터베이스 55 c++ = 88, 컴퓨터구조 62, HTML5 = 76
		//종료를 입력받으면 종료
		
		String study;
		int[] score = { 95, 88, 76, 62 ,55};
		String[] mok = {"Java", "C++", "HTML5", "컴퓨터구조","데이터베이스"};
		Scanner input = new Scanner(System.in);
		boolean num = true;

					System.out.printf("Java ,C++ , HTML5, 컴퓨터구조, 데이터베이스\n");
				do {
					System.out.print("과목이름>> ");
				
					study = input.nextLine();
					
					if(study.equals(mok[0])) {
					System.out.println(study +"점수는" + score[0] + "점입니다");
					num = false;
					}
					else if(study.equals(mok[1])) {
					System.out.println(study +"점수는" + score[1] + "점입니다");	
					num = false;
					}
					else if(study.equals(mok[2])) {
						System.out.println(study +"점수는" + score[2] + "점입니다");
						num = false;
					}
					else if(study.equals(mok[3])) {
						System.out.println(study +"점수는" + score[3] + "점입니다");
						num = false;
					}
					else if(study.equals(mok[4])) {
						System.out.println(study +"점수는" + score[4] + "점입니다");	
						num = false;
					}
					else if(num = true &&!study.equals("종료") ) {
						System.out.print("다시입력해주세요.\n");
					}
					
				} while(!study.equals("종료"));{
					System.out.print("시스템을 종료합니다.");
					return;
					
				}
	}

}
