package example;
import java.util.Scanner;
public class OperationExample {
	public static void main(String[]args) {
		//먼저 숫자 2개를 입력받고,마지막 기호를 입력받아야 함.
		//나눗셈의 경우 분모가 0이 아닌지 검사하여야 한다. 
		
		Scanner input = new Scanner(System.in);
		
			int num1;
			int num2;
			char ch;
		
		
			System.out.println("첫번째 숫자를 입력해주세요:");
			num1 = input.nextInt();
			System.out.println("두번째숫자를 입력해주세요:");
			num2 = input.nextInt();
			System.out.println("마지막 기호를 입력해주세요:");
			ch = input.next().charAt(0);
			
			switch(ch) {
			
				case '+':
					System.out.println("입력된 값은 + 이며,\n결과는" + (num1 + num2) + "입니다");
					break;
			
				case '-':
					System.out.println("입력된 값은 - 이며,\n결과는" + (num1 - num2) + "입니다");
					break;
			
				case '*':
					System.out.println("입력된 값은 * 이며,\n결과는" + (num1 * num2) + "입니다");
					break;	
			}
			if(ch == '/') {
					
				double chh;
				chh = (double)num1 / num2;
					System.out.println("입력된 값은 / 이며,\n결과는" + chh + "입니다");
			}
			input.close();
	}
		
}
