package exam_input;
import java.util.Scanner;   				   // Scanner를 사용하기위해 import 를 생성
public class TwoNumberSum {
	public static void main(String []args) {	
	                                           // 클래스 참조변수 =  메모리할당 연산자 생성자 (초기값;)
		Scanner input = new Scanner(System.in);
	
		int sum1; //첫번째 숫자 저장 
		int sum2; //두번째 숫자 저장
	
	
/*
			System.out.print("첫번째 숫자를 입력하세요:");
			sum1 = input.nextInt();

			System.out.print("두번째 숫자를 입력하세요:");
			sum2 = input.nextInt();
	
*/			System.out.println("두수의 합을 공백을 기준으로 입력해주세요:");
			sum1 = input.nextInt();
			sum2 = input.nextInt();

		
		int sum3 = sum1 + sum2;

			System.out.print("두수의 합은" + "\"" + sum3 + "\"" + "입니다.\n"); //더해서 나옴
			System.out.print("두수의 합은" + "\"" + (sum1 + sum2) + "\"" + "입니다."); //더해서 나옴
			System.out.print("두수의 합은" + "\"" + sum1 + sum2 + "\"" + "입니다."); // 연결되어 나옴
		input.close();
	
	
	
	}
}
