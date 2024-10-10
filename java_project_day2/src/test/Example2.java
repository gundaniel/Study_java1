package test;
import java.util.Scanner;
public class Example2 {
	public static void main(String[]args) {
		
		//x개의 사탕을 y명의 학생들에게 똑같이 나누어주려고할때, 각학생들이 받을 수있는 사탕의 수
		//와 남는 사탕의 수를 계산해 출력하는 프로그램을 작성 하시오.

		Scanner input = new Scanner(System.in);
		
			int candy;
			int student;
			int give;
			int tresh;
			int tresh1;
			
					System.out.print("사탕의 개수를 입력하세요:");
				candy = input.nextInt();
				input.nextLine();
		
					System.out.print("학생의 수를 입력하세요:");
				student = input.nextInt();	
				input.nextLine();
		
				give = (candy / student);
				tresh = (candy - (give * student));
				tresh1 = (candy % student);
					System.out.printf("사탕을 받을 수 있는 수는 %d이며, 남은개수는 %d입니다.\n", give, tresh);
					System.out.printf("사탕을 받을 수 있는 수는 %d이며, 남은개수는 %d입니다.", give, tresh1);	//%d 연산자 사용
		
		input.close();

	} 
}
