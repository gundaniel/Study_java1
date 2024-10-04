package exam_if;
import java.util.Scanner;
public class IfElseExample {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
	//----------------------------------------------------[예제1]	
		int score = 90;
		String result1 = "";
		
		
		if(score >= 90) {
		result1 = "합격입니다."; 
		}
		else {
		result1 = "불합격입니다."; 
		}
			System.out.println(result1);
	//----------------------------------------------------[예제2]	
		
		int num= 0;
		String data = "";
	
	
			System.out.print("수를 입력해주세요:");
		num = input.nextInt();
		input.nextLine();
			
			//System.out.print("수의 초기값은" + num + "이며 ");
			
		if (num % 2 ==0) {	
			data = "짝수";
		}
		else {
			data = "홀수";	
		}	
			System.out.printf("이 %d는 %s입니다", num , data);

	
		input.close();
	
	
	}
}