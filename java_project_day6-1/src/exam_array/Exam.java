package exam_array;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Exam {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
			
		//5명의 국어점수는 80, 95 90 85 100으로 배열에 초기화 하고 
		//영어점수를 입력받아 배열에 저장하여 출력하는 프로그램을 작성하라
		
		int[] korean = {80, 95, 90, 85, 100};
		
		for(int s : korean) {
			System.out.print("국어점수는" + s + "입니다\n");
		}
		System.out.println();
		
		//-------------------------------------------------------------------------
		
	/*	int[] eng = new int[5];
	
		for(int i = 0; i < eng.length; i++) {
			System.out.print((i+1) + "번째 영어점수를 입력하세요\n");
			eng[i] = input.nextInt();
		}
		
		for(int i = 0; i < eng.length; i++) {
		System.out.print((i+1) +"번째의 영어의 점수는" + eng[i] + "점입니다\n");
		}		
		System.out.println();
			System.out.print("3번째의 영어의 점수는" + eng[2] + "점입니다\n"); //인덱스 번호는 출력하고자 하는 번호의 -1을 하여야 한다.
		*/	
		//-------------------------------------------------------------------------	
			int[] array1 = new int[10];
			
			for(int i = 0; i < array1.length; i++) {
				array1[i] = i + 1;
			}
			
			for (int i =0; i < array1.length; i++) {
				System.out.print(array1[i] + " ");
			}
			System.out.println();
		
	
	
	
	}

}
