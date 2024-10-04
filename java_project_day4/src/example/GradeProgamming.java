package example;
import java.util.Scanner;
public class GradeProgamming {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
			//다음과 같은 성적 처리 프로그램을 작성하시오
			//중간 기말 레포트 출석점수를 입력받음
			/* 성적은 아래에 준한점수로
			(중간 + 기말)/2 ->60%
			레포트 -> 20%
			출석 -> 20%
			
			학점의 기준(if - else if 사용)
			90이상 A 80이상 B 70이상 C 60이상 D 나머지 F
			
			평가기준(switch 사용)
			A,B exellent C,D good F poor
			
			출력화면 
			---결과입니다 ---
			중간고사 : 90
			기말고사 : 89
			레포트 : 99
			출석점수 :100
			
			성적 :93.5
			학점: A
			평가:exellent */
			
			double mid;
			double end;
			double report;
			double att;
			
			String grade = " ";
			char cls = ' ';
			
			
			

			System.out.print("중간고사 점수를 입력하세요:");
			mid = input.nextInt();
			
			System.out.print("기말고사 점수를 입력하세요:");
			end = input.nextInt();
			
			System.out.print("레포트 점수를 입력하세요:");
			report = input.nextInt();
			
			System.out.print("출석점수를 입력하세요:");
			att = input.nextInt();
			
			double total = (mid + end)/2 ;
			double six;
			six = total * 0.6;
			
			
			double fulltotal = (six + (report* 0.2) + (att*0.2));
			
			
			if(fulltotal >= 90) {
				cls = 'A';
			}
			else if(fulltotal >= 80 ){
				cls = 'B';
			}
			else if(fulltotal >= 70 ){
				cls = 'C';
			}
			else if(fulltotal >= 60 ){
				cls = 'D';
			}
			else if(fulltotal < 60 ){
				cls ='F';
			}
			
				switch(cls) {
				case 'A': case 'B':
					grade = "exllent";
				break;	
				case 'C': case 'D':	
					grade = "good";	
				break;	
				case 'F':	
					grade = "poor";	
				}
			
			System.out.println("---결과입니다---");
			System.out.println("중간고사:" + (int)mid);
			System.out.println("기말고사:" + (int)end);
			System.out.println("레포트:" + (int)report);
			System.out.println("출 석:" + (int)att);
			System.out.println();
			System.out.printf("성적:%.2f\n" ,(double)fulltotal);
			System.out.println("학점:" + cls);
			System.out.println("평가:" + grade);
			
			
			
			
			
			
			
			
			
		
		
		
			input.close();
	}
}
