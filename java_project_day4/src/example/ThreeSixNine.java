package example;
import java.util.Scanner;


public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
	
		
			int num;	
			boolean a = false;
			
			do {
				System.out.print("\n삼육구입니다. 숫자를 입력해주세요:");
				num = input.nextInt();
				
			int num1 = num % 10;
			int num2 = num / 10; 
			
				if(num1 == 3 || num1 == 6 || num1 == 9) {
					System.out.print("박수 짝");
					a = true; 
				}
				if(num2 == 3 || num2 == 6 || num2 == 9) {
					System.out.println(a? "짝" : "박수 짝");
				}
			
			}
			while(num <= 99);{
					System.out.print("입력이 올바르지 않습니다");
			
			}
	
			input.close();
	}
}	
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				/*	int num1 = num % 10;
				int num2 = num / 10; 
				
			
				if((num1 == 3 || num1 == 6 || num1 == 9) && (num2 != 3 || num2 != 6 || num2 != 9)) {
					System.out.println("박수짝");
					a = true; 
				}
				if((num1 != 3 || num1 != 6 || num1 != 9) && (num2 == 3 || num2 == 6 || num2 == 9)) {
					System.out.println("박수짝");
					b = true;
				}
				if((a == true) && (b == true)) {
					System.out.println("박수짝짝"); 
				}
			} */
			

	


