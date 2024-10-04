package exam_if;
import java.util.Scanner;
public class IfTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// 두정수를 입력받아 작은 값, 큰값순으로 입력되게 출력하시오
			int num1;
			int num2;
		
			System.out.print("첫번째 숫자를 입력해주세요:");
			num1 = input.nextInt();
			input.nextLine();
		
			System.out.print("두번째 숫자를 입력해주세요:");
			num2 = input.nextInt();
			input.nextLine();	

			
			if(num1 > num2) {
			System.out.printf("작은수= %d, 큰수 = %d", num2, num1);
			}
			else if(num2 > num1) {
			System.out.printf("작은수= %d, 큰수 = %d", num1, num2);
			}
			else {
				
			}
			
			
				//System.out.printf("작은 수 = %d\n",((num1 > num2) ? num2 : num1));
				//System.out.printf("큰 수 = %d\n",((num1 > num2) ? num1 : num2));
				
				//System.out.print( Math.min(num1,num2) + "부터" + Math.max(num1,num2));
				
			input.close();
		
	
	}
	
}
