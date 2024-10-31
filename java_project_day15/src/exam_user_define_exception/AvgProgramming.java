package exam_user_define_exception;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 사용자로부터 국어, 영어, 수학 점수를 입력 받아서 평균을 계산하는 프로그램을 작성하여 보자.(AvgProgramming)
 * 만약 사용자가 음수를 입력하면 NegativeNumberException(사용자 정의 예외 클래스) 인 
*  사용자 정의 예외 객체를 생성한다.
 * 이 예외를 catch 블록으로 잡아서 처리하는 코드도 추가해야 합니다.
 * 또한 sum() 이라는 점수의 합을 반환 받도록 메서드를 정의하여 봅시다.
*/
/*
	[실행 예시]
	국어 입력 : 90
	영어 입력 : 81
	수학 입력 : 79
	평균은 83.33입니다.
	 
	국어 입력 : 97
	영어 입력 : -59
	음수는 입력할 수 없습니다.
*/
@SuppressWarnings("serial")
class NegativeNumberException extends Exception { // 예외 클래스를 상속받아 만들어야 예외클래스로 생성됨
	public NegativeNumberException() {
		super("음수는 입력할 수 없습니다.");
	}
}

public class AvgProgramming {
	static Scanner input  = new Scanner(System.in);
	
	public static void main(String[]args) {
		int tot = 0;
		try {
			tot = sum();
			System.out.printf("평균은 %.2f입니다.", tot/3.0);
		}
		catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		catch(NegativeArraySizeException et) {
			System.out.println("예외 발생");
		}
	}

	public static int sum() throws NegativeNumberException{ // 합을 구하는 메서드
		int score, tot = 0;
		String[] subject = {"국어", "영어", "수학"};
	
		for(int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + "입력 :");
			score = input.nextInt();
			if(score < 0) // 예외 상황 - 음수의 값을 입력받았을때
			throw new NegativeNumberException(); // 예외 객체 생성
			tot += score;
		}
			return tot;
	}	
}

