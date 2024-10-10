package exam_array;
import java.util.Scanner;
public class ScoreExample {
	public static void main(String[]args) {
		
	Scanner input = new Scanner(System.in);
	
	int student;
	int score = 0;

		System.out.print("학생의 수를 입력해주세요: ");
		student = input.nextInt();
		
		int[] scores = new int[student];
		
		for(int i = 0; i < student; i++) {
			System.out.print("점수를 입력해주세요: ");
			scores[i] = input.nextInt();
		}	
		for(int i = 0; i < student; i++) {
			score += scores[i];
		}
		
		System.out.print("학생의 수는" + student + " 명, 평균점수는 " + (score / student) + "점입니다.");
		
			
			
	}
}	

