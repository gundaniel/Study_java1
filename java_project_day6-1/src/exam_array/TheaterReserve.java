package exam_array;
import java.util.Scanner;
public class TheaterReserve {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int size =10;
		int[] sit = new int[size];
		int num;
		

			while(true) {
			System.out.println("----------------------");
			for(int i = 1; i <= size; i++) {
				System.out.print(i + " ");
			}
			System.out.println("\n----------------------");
			for(int i = 0; i < size; i++) {
				System.out.print(sit[i] + " ");	
			}
				System.out.println();
				System.out.println("좌석을 예약해주세요(종료는 -1):");
				num =input.nextInt();
				
				if(num == -1) {
					System.out.println("예약이 종료됩니다.");
					break;
				}

				if ((num >= 1) && (num <= 10)) {
					if(sit[num - 1] == 0) {
						sit[num - 1] = 1;
						System.out.println("예약되었습니다.");
					}
					else {
						System.out.println("이미 예약이 되어었습니다.");
					}
				}
				else {
					System.out.println("좌석이 잘못되었습니다..");
				}
		}
		input.close();
	}						
}

			

		
		
		


