package exam_switch;
import java.util.Scanner;
public class DayInMonth{ 
	public static void main(String[] args) {
		
		// 1년의 각 월의 일수를 출력하는 프로그램을 작성
		// 즉 틍정 월이 입력받아 그월의 일수를 출력 
	
		Scanner input = new Scanner(System.in);	
		
			int mon;
			int year;
			int day = 0;
			
				System.out.print("일수를 알고 싶은 년도를 입력하세요:");
			year = input.nextInt();
			
				System.out.print("일수를 알고 싶은 월을 입력하세요:");
			mon = input.nextInt();
			
			if((mon >= 1) && (mon <= 12)) {
				switch(mon) {
					case 1: case 3: case 5: case 7: case 8: case 10: case 12:
						day = 31;
						break;
						
					case 4: case 6: case 9: case 11:
						day =30;
						break;
						
					case 2:  // 윤년 계산 (년도가 4의 배수이고, 100의 배수가 아니거나, 400의 배수인 달)
						
						if((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)) {
							day = 29;
						}
						else {
							day =28;
						}
						break;
						
					default :
						System.out.println("년수가 잘못 입력되었습니다");
				}
					System.out.printf("해당 %d년도의 월수는 %d일입니다", year, day);
			}
			else {
				System.out.println("년수가 잘못 입력되었습니다");
			}
						
			input.close();
		}
		
}


