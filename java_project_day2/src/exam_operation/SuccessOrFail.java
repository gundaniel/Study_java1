package exam_operation;
import java.util.Scanner;
public class SuccessOrFail {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

			int score;
	
				System.out.print("점수를 입력해주세요:");
			score = input.nextInt();
			input.nextLine();
		
			//String grade = (score >= 80) ? "합격입니다" : "불햡격입니다"; // 삼항연산자
				//System.out.println(grade);
	
			/* if(score >= 80) { 								//if에는 세미콜론(;)을 쓰지 않음
				System.out.print("축하합니다~ 합격입니다~!");	
			}			
			else {
				System.out.print("죄송합니다. 불합격입니다.");
			} */
	
			
			if(score >= 80) { 								//if에는 세미콜론(;)을 쓰지 않음
				System.out.print("축하합니다~ 합격입니다~!");	
			}			
			else {
				System.out.print("죄송합니다. 불합격입니다.");
			}
	
			input.close();
			
	}
	
}
