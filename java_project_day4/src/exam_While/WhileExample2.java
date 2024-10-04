package exam_While;
import java.util.Scanner;
public class WhileExample2 {
	public static void main(String[]args) {
		
		int num;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("숫자를 입력하세요:\n");
			num = input.nextInt();
			sum += num;
			if(num != -1) {
			System.out.print("다시 입력하세요.(-1를 입력하면 종료됩니다)");
			}
		}
		while(num != -1);{
			System.out.printf("지금까지 수의 합은%d입니다", sum);
		}
		
		input.close();
	}
}
