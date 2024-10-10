package exam;

import java.util.Scanner;
public class RepetitiveExample {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			int choice;
			int num1;
			int num2;
			
				
			while(true) {
				System.out.println("연산자를 선택해주세요(5번을 선택시 종료됩니다.");
				System.out.println("1.+ ");
				System.out.println("2.- ");
				System.out.println("3.* ");
				System.out.println("4./ ");
				System.out.println("5.종료");
				System.out.println("선택>>");
				choice = input.nextInt(); 
				
			
				if(choice > 5 || choice < 1) { 
					System.out.print("1부터 5까지의 번호를 선택해주세요\n");
				continue;
				}
				else if(choice == 5) {
					System.out.print("프로그램을 종료합니다.");
					return;
				}
					System.out.print("사칙 연산을 할 두 수를 입력하세요.(공백을 기준으로 입력하여 주세요):");
				num1 = input.nextInt();
				num2 = input.nextInt();
				
				switch(choice){
				
					case 1:
						int num3 = num1 + num2;
						System.out.println(num1 + " + " + num2 + " = " + num3);
						break;
					case 2:
						int num4 = num1 - num2;
						System.out.println(num1 + " - " + num2 + " = " + num4);
						break;
					case 3:
						int num5 = num1 * num2;
						System.out.println(num1 + " * " + num2 + " = " + num5);
						break;
					case 4:
						int num6 = num1 / num2;
						System.out.println(num1 + " / " + num2 + " = " + num6);
						break;
				
				}
						continue;
			}		
					
	}
}			

		
		
