package exam_user_define_exception;
@SuppressWarnings("serial")
class DivideByZeroException extends Exception{
//class 사용자 저으이 예외 클래스 extends 예외 클래스명 ()
	//필드
	private String msg;
	
	//생성자 선언
	public DivideByZeroException() {}
	public DivideByZeroException(String msg) {
	this.msg = msg; 	
	}
	//출력메서드
	@Override
	public String getMessage() {
		if(msg == null) {
			return "0으로 나눌 수 없음.";
		}
		else {
			return msg;
		}
	}
}

public class DivideProgramming {
	public static void main(String[]args) {
		
		double result;
		try {
			result = quotient(1,0);
			System.out.println(result);
		}
		catch(DivideByZeroException e) {
			System.out.println(e.getMessage());
			//System.out.println(e.toString());
		}
	}
	
	public static double quotient(int n, int d) throws DivideByZeroException{
		if(d == 0) // 예외 발생
			throw new DivideByZeroException("나눗셈에서 0으로 나눌 수 없습니다."); //예외객체 생성
		return (double) n / d ;
	}
}
