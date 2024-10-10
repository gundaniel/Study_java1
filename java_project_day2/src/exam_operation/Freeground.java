package exam_operation;
import java.util.Scanner;
public class Freeground {
	public static void main(String[]args) {
		
		//-----------------------------------------------------------------------	
		double num = 3.14; 			// "(int)"는 캐스팅 연산자 강제로 형을 변환함 
		int num1;
			num1 = (int) num; 
				System.out.println("--------------------------");	
				System.out.println(num1);
		//-----------------------------------------------------------------------		
		int num2;	
			num2 = 3 / 2; 				//정수 나누기 정수는 실수가 될 수 없음 -> 결과 = 1
				System.out.println(num2);		
		//-----------------------------------------------------------------------
		double num3;				
			num3 =  3 / 2;		// 선언된 것이 실수 -> 실수로 출력 -> 결과 = 1.0
				System.out.println(num3);	
			//-----------------------------------------------------------------------		
		double num4;				
			num4 = (double) 3 / 2;		// 실수 (캐스팅연산자) 사용하여 정수를 실수로 변경 -> 결과 = 1.5
				System.out.println(num4);		
		//-----------------------------------------------------------------------
	
	
		
		//-----------------------------------------------------------------------	
		int x = 10;
		int y = 10;
		int z;
		
				System.out.println("--------------------------");
			
			x++; //+1 증가 후위 연산자 선처리 후증가
			++x; //+1 증가 전위 연산자 선증가 후처리
		
				System.out.printf("x= %d\n", x);  //1. 결과? = 12
				System.out.println("--------------------------");
			
			y--; //-1 감소 후위 연산자 선처리 후감소
			--y; //-1 감소 전위 연산자 선감소 후처리
		
				System.out.printf("y= %d\n", y);  //2. 결과? = 8
				System.out.println("--------------------------");
			
			z = x++;
		
				System.out.printf("z = %d\n", z);  //3. 결과? = 12
				System.out.printf("x = %d\n", x);  //4. 결과? = 13
				System.out.println("--------------------------");
			
			z = ++x;
			
				System.out.printf("z = %d\n", z);  //5. 결과? = 14
				System.out.printf("x = %d\n", x);  //6. 결과? = 14 
				System.out.println("--------------------------");
		
			z = ++x + y++;
		
				System.out.printf("z = %d\n", z);  //7. 결과? = 23 
				System.out.printf("z = %d\n", x);  //8. 결과? = 15
				System.out.printf("z = %d\n", y);  //9. 결과? = 9
				System.out.println("--------------------------");
			
		//-----------------------------------------------------------------------	
	
				
		int a = 1;
		int b = 2;
			a += b; //= a + b와 동일함. a의 공간에저장하는 개념 = a+b의 값 = 증가된 a 
		
				System.out.println("c는 " + a);
				
	
		boolean c =(a == b); // !=  문자를 사용할때는 equals() !equals() 메서드로 확인
				System.out.println("c는 " + c);
		
		
		
	}
}
