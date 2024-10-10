package exam_int;
import java.util.Scanner;
public class IntExample {
	public static void main(String[]args) {
		//두 변수를 선언하고 임의의 수를 입력받아 서로 값을 교환하여 출력하는 프로그램을 작성
		//두변수를 a,b에 대입후 a =1증가 b =1감소 하여 출력하라
	
		Scanner input = new Scanner(System.in);	
		
		int x , y;
		//int s;

		
			System.out.print("첫번째 수를 입력하세요:");
		x = input.nextInt();
		input.nextLine();
		
			System.out.print("두번째 수를 입력하세요");
		y = input.nextInt();
		input.nextLine();
		

		/* 1번 예제
		s = x;
		x = y;
		y = s;
	
			System.out.println("x=" + x + "y=" + y);
	*/
	
		
		//2번 예제
		int z;
		
		x = (x + 1);
		y = (y - 1);
		z = (x + y);
		
			System.out.printf("1더하기된 x값은 %d이며,\n" + "1마이너스된 y값은 %d입니다.\n", x, y);
			System.out.println("합은" + z +"입니다");
			
		input.close();
		

				
		
			
		
		
		
		
		
		

		
		
		
		
		
	}
}
