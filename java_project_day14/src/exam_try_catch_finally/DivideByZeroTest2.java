package exam_try_catch_finally;

public class DivideByZeroTest2 {
	public static void main(String[]args) {
		int x = 1;
		int y = 0;
		
		try {
			int result = x /y; //예외 발생 
			System.out.println("result= " + result);
		}
		catch(ArithmeticException e) { // 예외처리
			System.out.println("0으로 나눌 수 없습니다.");
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		 System.out.println("프로그램은 계속 진행됩니다.");
	}
}
