package exam_operation;
import java.util.Scanner;
public class LOogicalOperator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x= 3;
		int y =4;
		
			System.out.println((x == 3) && (y ==7)); // && 논리곱 = (and)의 개념 둘다 참이어야 true    = false
			//--------------------true------ false---
			
			System.out.println((x == 3) || (y == 4)); // || 논리합 (or)의 개념 둘중하나만 참이면 true   = true
			//------------------true----------true--------
			
		boolean result = (++x == 3) && (y++ == 7); // 둘다 맞을 경우 실행
						//false
			//단락회로평가: 앞의 항이 false 이면 뒤 항의 결과를 판단하지 않아도 false 이다.
			System.out.println(("x= " + x + "y=" + y)); // 1. 결과? x= 4, y = 4
			System.out.println("result = " + result); // 2. 결과? result = false
			
			//--------------------------------------------------

		result = (x++ == 4) || (++y == 7);  // x식은 실행, y식은 미실행
		
			System.out.println(("x= " + x + "y=" + y)); // 3. 결과?; x = 5 , y = 4 
			System.out.println("result = " + result); // 4. 결과? result = true 
		
			//--------------------------------------------------
	
		int score;
	
			System.out.print("점수를 입력해주세요:");
		score = input.nextInt();
		input.nextLine();
		
		String grade = (score >= 80) ? "합격입니다" : "불햡격입니다"; // 삼항연산자
			System.out.println(grade);
	
	
	
	}
}
