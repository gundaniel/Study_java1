package test;
import java.util.Scanner;
public class Example1 {
	public static void main(String[]args) {
		
		// 요구사항 = 국어, 영어, 수학 점수를 입력받아 총점과 평균 (소수 첫번째 자리)르 구해 출력하는 프로그램을 작성하시오.
		
		Scanner input = new Scanner(System.in);	 
		
			double korean, english, math;
		
					System.out.print("국어점수를 입력하시오:");
				korean = input.nextDouble();
				input.nextLine();
					System.out.print("영어점수를 입력하시오:");
				english = input.nextDouble();
				input.nextLine();
					System.out.print("수학점수를 입력하시오:");
				math = input.nextDouble();
				input.nextLine();
		
			double total = (korean + english + math);
			double average = ((korean + english + math)/3);
		
					System.out.printf("점수의 총점은%.1f이며, 평균은%.1f입니다.", total, average);
		
			input.close();
			
		
	}
}
