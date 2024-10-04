package exam_if;
import java.util.Scanner;
public class MaximumFinder {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// 3개의 정수를 입력받아 최댓값을 출력되게 출력하시오
			int num1;
			int num2;
			int num3;
	
				System.out.println("첫번째 숫자를 입력해주세요:");
			num1 = input.nextInt();
			input.nextLine();
				System.out.println("두번째 숫자를 입력해주세요:");
			num2 = input.nextInt();
			input.nextLine();
				System.out.println("세번째 숫자를 입력해주세요:");
			num3 = input.nextInt();
			input.nextLine();	
			
			int maxnum = 0;
			
			if( num1 > num2 && num1 > num3) {
				maxnum = num1;
			}
			else if( num2 > num1 && num2 > num3) {
				maxnum = num2;
			}
			else if( num3 > num1 && num3 > num2) {
				maxnum = num3;
			}
			else {
			}
				System.out.println("가장 큰 수는" + maxnum + "입니다");
			
			
			
			input.close();
		
	
	}
	
}

