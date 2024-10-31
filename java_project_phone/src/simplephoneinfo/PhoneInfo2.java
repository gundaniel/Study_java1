package simplephoneinfo;
import java.util.Scanner;
public class PhoneInfo2 {
	static Scanner input = new Scanner(System.in);
	public static void main (String[]args) {
				
	PhoneBookVer02 pb2 = new PhoneBookVer02();
		
		while(true) {
			System.out.println("선택하세요");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 프로그램 종료");
			System.out.print("선택 >> ");
			int num  = input.nextInt();
			input.nextLine();
			
			if(num == 1) {
				System.out.print("이름: ");
				pb2.setName(input.nextLine());
				System.out.print("전화번호: ");
				pb2.setNumber(input.nextLine());
				System.out.print("생년월일: ");
				pb2.setBirth(input.nextLine());
				pb2.showInfo();
			}
			else if(num == 2) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else {
				System.out.println("올바른 값을 입력하세요");
			}	
		}
		input.close();
	}
}
