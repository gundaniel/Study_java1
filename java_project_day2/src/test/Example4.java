package test;
import java.util.Scanner;
public class Example4 {
	public static void main(String[]args) {
		
		//세자리수 를 입력하고 각자리수의 합을구하시오
		
		Scanner input = new Scanner(System.in);	

			int num1;
	
					System.out.printf("숫자(세자리수)를 입력하세요: ", "\n\r");
				num1 = input.nextInt();
				input.nextLine();

			int num2 = num1 / 100;
			int num3 = num1 / 10 % 10;
			int num4 = num1 % 10;
			int sumnumber = num2 + num3 + num4 ;
	
					System.out.printf("세자리 수의 합은 %d입니다\n", sumnumber);

				input.close();
		
	}
}
