package exam;
import java.util.Scanner;

public class Example {
	public static void main(String[]args) {
		
		//곱셈은 덧셈을 편하게 하기 위한 연산이다.
		// 덧셈으로 곱셈을 하는 코드를 작성하시오.
		//3 *9 일경우, 3*9가 효율적인가 9*3이 효율적인가?
		
		Scanner input = new Scanner(System.in);
		
	
        	System.out.print("첫 번째 숫자를 입력하세요: ");
        	int a = input.nextInt();
        	System.out.print("두 번째 숫자를 입력하세요: ");
        	int b = input.nextInt();
        
        	int result = 0; // 결과를 저장할 변수
        	int temp = 0; // 값을 변경할 변수
        
        	if( a > b && !(a < b)){ // a가 b보다 클 경우 값을 변경(효율적)
        		temp = a;
        		a = b;
        		b = temp;	
        	}       	
        	
        	for (int i = 0; i < b; i++) {
        		result += a;
        	}
        
        	// 결과 출력
        	System.out.println("덧셈을 곱셈으로 변환한 결과: " + result);
    }
}


