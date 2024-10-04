package exam_While;
import java.util.Scanner;
public class GugudanExample {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		int gob = 0;
		int sum =0;
		
			System.out.println("곱하고 싶은 값을 입력하세요:");
			num = input.nextInt();
			
		while(gob <= 9) {
			
			gob++;
			
			sum = (num * gob);  
			
			System.out.println(num + "X" + gob + "=" + sum);
			
			
		}
		input.close();
	}

}
