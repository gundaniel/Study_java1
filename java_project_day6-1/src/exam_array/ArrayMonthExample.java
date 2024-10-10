package exam_array;
import java.util.Scanner;
public class ArrayMonthExample {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int su = 0;
		
		System.out.println("각 월의 마지막 일을 출려하고자 합니다. (1월~12월)");
		do{
			System.out.print("원하는 월 : ");
			su = input.nextInt();
		}while(su <1 ||su > 12);

		System.out.println(su + "월은 " + month[su -1] + "일입니다...");
		
		input.close();
	
	}

}
