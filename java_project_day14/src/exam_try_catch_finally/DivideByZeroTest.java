package exam_try_catch_finally;

public class DivideByZeroTest {
	public static void main(String[]args) {
		
		//예외처리 전 코드
		int x = 1 , y = 0;
		int result  = x /y; //예외 코드
		System.out.println("result = "  + result);
	}
}
