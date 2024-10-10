package exam_operation;
import java.util.Scanner;
public class ConditionalOperationExample {
	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
				
		int x;
		int y;
			
			System.out.print("첫번째 값을 입력해주세요:");
		x = input.nextInt();
		input.nextLine();
			
			System.out.print("첫번째 값을 입력해주세요:");
		y = input.nextInt();
		input.nextLine();
		
			System.out.println("두수 중 최대의 값은:" + ((x > y) ? x :y));
			System.out.println("두수 중 최대의 값은:" + Math.max(x,y));
			System.out.println("두수의 차이는:" + ((x > y) ? x - y : y - x));  // 삼항 연산자 사용
			
		
		 /* int xx = Math.max(x,y);
		int yy = (Math.max(x,y) - Math.min(x,y));
			System.out.printf("두수의 차는 %d입니다.\n" , yy);
		*/
		
		//-------------------------------------------------------------
		int z;
		
			System.out.print("숫자를 입력해주세요:");
		z = input.nextInt();
		input.nextLine();
		
			System.out.printf("%d는" , z);
			System.out.print((z % 2 == 0) ? "짝수" : "홀수"); // 삼항 연산자 사용
			System.out.printf("입니다");
			
		input.close();
			

	}

}
