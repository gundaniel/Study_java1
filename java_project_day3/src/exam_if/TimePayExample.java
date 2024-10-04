package exam_if;
import java.util.Scanner;
public class TimePayExample {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
	// 사용자로 하여금 사원번호, 근무시간, 시간당 금액을 입력받아 사원번호와 급여를 출력하도록 프로그램 작성
	// 	급여 = 근무시간 * 시간당 금액으로 처리
	//	40시간 초과시간만큼 시간당 금액의 50%를 더 받는다.
	
		String name;
		String cnum;
		double ctime;
		double mpay;
		double totalpay;
			
		
			System.out.print("이   름을 입력하세요:");
		name = input.nextLine();
			System.out.print("사원번호를 입력하세요:");
		cnum = input.nextLine();
			System.out.print("근무시간을 입력하세요:");
		ctime = input.nextInt();
		input.nextLine();
		
		mpay = (9860 * ctime);
		totalpay = ((9860 * 1.5)*ctime);
		
			System.out.printf("이   름:%s\n",name);
			System.out.printf("사원번호:%s\n",cnum);
			System.out.printf("근무시간:%d\n",(int)ctime);	
		
		if(ctime >= 40) {
			System.out.printf("총 급여는 %d입니다", (int)totalpay);		
		}
		else if(ctime < 40) {
			System.out.printf("총 급여는 %d입니다", (int)mpay);	
		}
	
		
		input.close();
		
		
	}
}
