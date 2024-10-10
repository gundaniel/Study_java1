package exam;
import java.util.Scanner;
public class EvenOddNumber {
	
		public static void main(String[] args) {
			
			//두수를 입력받아 두수사이(포함)에 홀수와 짝수의 합을 출력하는 프로그램을 작성하시오
			//수의 크기에 상관없이 수행가능해야 한다.
			
			
			Scanner input = new Scanner(System.in); 
			
	    	int num;
	    	int num1;
	        int sum = 0;
	        int sum1 = 0;
	        
	        
	        System.out.print("첫번째 정수를 입력하시오: ");
	        num = input.nextInt();
	        System.out.print("두번째 정수를 입력하시오: ");
	        num1 = input.nextInt();
	        
	        
	        for(int i = num; i <= num1; i++) {
	        	if(i% 2 == 0)
	            	sum += i; // = sum = sum + i
	            else
	            	sum1 += i; // = sum1 = sum1 + i
			}
	        System.out.printf("%d부터 %d까지의 정수 중 홀수의 합은 %d 짝수의 합은 %d이다.",
	        	num, num1,  sum1, sum);
	            input.close();
		}
}	