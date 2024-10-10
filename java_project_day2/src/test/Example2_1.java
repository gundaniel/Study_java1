package test;
import java.util.Scanner;
public class Example2_1 {
	public static void main(String[]args) {
	
		Scanner input = new Scanner(System.in);
	
	
		//달걀 456개를 12개씩 담을 수 있는 상자를 삼항 연산자를 사용하여 실행결과와 같이 출력하도록 하시오
		//달걀 수입력받으라
	
			int egg;
			int box;
				box =12;
	
					System.out.print("달걀의 수를 입력하시오:");
				egg = input.nextInt();
				int result = (egg / box);
				
					System.out.printf((egg == 456) ? 
							"달걀 456개를 12개씩 담을 수 있는 상자의 수는 %d개입니다" : "달걀의 수가 맞지 않습니다 다시 입력해주세요.",result);
							
			/*	
				
			int result = (egg / box); //삼항연산자 사용
	
			if (egg == 456) {
					System.out.printf("달걀 %d를 12개씩 담을 수 있는 상자의 수는 %d 개입니다", egg, result);
			}	
			else {
					System.out.print("달걀의 수가 맞지 않습니다 다시 입력해주세요.");	
			}
	*/
		input.close();
	
	
	}
}
