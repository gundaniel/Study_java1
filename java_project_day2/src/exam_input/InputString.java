package exam_input;
import java.util.Scanner;

/*각자의 이름,나이, 주소를 입력받아 아래와 같이 출력

[출력문예시]
000님 안녕하세요! 00살이시네요.
주소는 서울특별시 000입니다 */

public class InputString {
	public static void main(String[]args) {
	
		Scanner input = new Scanner(System.in);	
		
		String sum1;
		int sum2;
		String sum3;
	
			System.out.print("이름을 입력해주세요:");
		sum1 = input.nextLine();
			System.out.print("나이를 입력해주세요:");
		sum2 =input.nextInt();
		input.nextLine();	
			System.out.print("주소를 입력해주세요:");	
		sum3 = input.nextLine();

			System.out.print("\"" + sum1 + "\"" + "님 안녕하세요." + "\"" + sum2 + "\"" +"살이시네요!\n");
			System.out.print("주소는 " + "\"" + sum3 + "\"" + " 입니다.");
		
		input.close();
		

		
	}

}


