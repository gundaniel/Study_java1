package exam_break;
import java.util.Scanner;
public class BreakExample {
	public static void main(String[]args) {
		
		// 사용자가 입력한 점수의 총점, 평균을 내는 프로그램을 작성하시오.
		// 단 종료는 0 ~100 사이가 아닌 값을 입력하면 된다. 
		
		Scanner input = new Scanner(System.in);
	
		int num1;
		int sum = 0;
		int count = 0;
		
		do{
			System.out.print("점수를 입력하세요(0~100이 아닌값을 입력하면 종료됩니다):");
			num1 = input.nextInt();
		
			if (num1 <= 100 && num1 >= 0 ) {
			sum += num1;
			count++;
			}
		}	
		while(!(num1 > 100) || (num1 < 0));{
			System.out.println();
		}	
			System.out.print("총점은" + sum + "점이며, 평균은 " + (sum / count) + "입니다");	
	}
}
