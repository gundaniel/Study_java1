package exam_if;
import java.util.Scanner;
public class IfElseIfElseExample {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
	// 사용자로 하여금 점수를 입력받아 학점을 출력하는 프로그램을 작성하시오.
	// 90 ~ 100 A 80 ~ 89 B 70 ~ 79 C 60 ~ 69 D 59이하 F	
		int score ;
		char grade;
		//String don = "\"0~100점 사이의 점수를 입력해주세요\"";
		
		System.out.printf("점수를 입력해 주세요","\n");
		score = input.nextInt();
		input.nextLine();
		
		if(score > 100 || score < 0) {
		System.out.printf("0~100사이의 점수를 입력해 주세요","\n");
		}
		else {
			if (score >= 90) {
			grade = 'A';
			}
			else if (score >= 80){
			grade = 'B';
			}
			else if (score >= 70){
			grade = 'C';
			}
			else if (score >= 60){
			grade = 'D';
			}
			else {
			grade = 'F';
			}
		
		System.out.printf( "당신의 점수%d점은 \"%c\"입니다.", score, grade);
		//System.out.printf((score > 100 || score < 0)? don : "당신의 점수%d점은 \"%c\"입니다.", score, grade);
		
		input.close();
		
		}
	}
}
