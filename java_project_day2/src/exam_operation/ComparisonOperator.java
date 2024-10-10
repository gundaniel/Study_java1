package exam_operation;
import java.util.Scanner;
public class ComparisonOperator {
	public static void main(String[]args) {
		
		int x = 3;
		int y = 4;
		
			System.out.println("x == y = " + (x == y)); //비교연산자 boolean 자료형
			System.out.println("x != y = " + (x != y));
			
			System.out.println("x > y = " + (x > y));
			System.out.println("x < y = " + (x < y));
			System.out.println("x <= y = " + (x <= y));
	
		//-----------------------------------------------------------		
		char char1 = 'A'; // 아스키코드 65  문자 확인
		char char2 = 'B'; // 아스키코드 66
		
		boolean result1 = (char1 < char2); //결과는 아스키 코드 66이 더 높아서 B;
			System.out.println("result = " + result1);
		//-----------------------------------------------------------		
			
		Scanner input = new Scanner(System.in);
			
		String name1 = "홍길동";
		String name2;
			
			System.out.print("이름을 입력해주세요:");
			name2 = input.nextLine();
				
		if(name1.equals(name2)) {	 // 문자열은 equals로 판단할 것.
	//  if(name1 == name2) = 문자열은 연산자 사욯하면 안됨 
	// 주소값을 비교하므로 같지않다고 나옴 -> "메서드 equals, !equals" 사용
			
			System.out.println("이름이 일치합니다");
		}
		else {
			System.out.println("이름이 일치하지 않습니다");
		}
		//-----------------------------------------------------------		

		input.close();
	}
}
