package exam_array;
import java.util.Scanner;
public class ArrayExample {
	public static void main(String[]args) {
		
		int[] numbers = {10, 20, 30};
		
		//  = int[] numbers;
		//numbers[0] = 10; , numbers[1] = 20; numbers[2] =30; 선언과 동시에 값을 대입하는 것과 같음
		
		//--------------------------------------------------------- 정수타입 배열 선언
		System.out.println("numbers[0] = " + numbers[0]);
		System.out.println("numbers[1] = " + numbers[1]);
		System.out.println("numbers[2] = " + numbers[2]);
		System.out.println();
		//--------------------------------------------------------- 실수타입 배열선언
		double[] arrayDouble = new double[2];
		for(int i = 0; i < 2; i++) {
			System.out.println("arrayDouble[" + i + "] = " + arrayDouble[i]);
		}
		System.out.println();
		//--------------------------------------------------------- 문자열 타입 배열선언
		String[] arrayString = new String[3];
		
		arrayString[0] = "java";
		arrayString[1] = "oracle";
		arrayString[2] = "spring";
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arrayString[" + i + "]=" + arrayString[i]);
		}
		System.out.println();	
		//--------------------------------------------------------- // 입출력 예시
	
		//5개의 정수를 입력받아 그 값을 출력하시오

		/* Scanner input = new Scanner(System.in); 
		
		int[] nums = new int[5];
		 
		 System.out.print("===== 배열의 값 입력 =====\n");
		 for(int i = 0; i <5; i++) {
			 System.out.print((i+1)+"번째 정수입력 : ");
			 nums[i] = input.nextInt();
		 }
		 System.out.print("===== 배열의 값 출력1 =====\n");
		 for(int i = 0; i <5; i++) {
			 System.out.print("nums["+ i +"]=" + nums[i] + " ");
		 }
		 System.out.println();
		 
		 System.out.print("===== 배열의 값 출력1 =====\n");
		 for(int value : nums) {
			 System.out.print(value + " ");
		 }
		*/ System.out.println();
		//---------------------------------------------------------
		
		 //문자열 배열선언 예시
		
		 String[] language = {"Java ", "Oracle ", "Spring\n"};
		 
		 for(String s : language) { // 데이터 타입 변수명 : 배열명
			 System.out.print(s); //출력은 변수명을 출력
		 }
		 for(int i = 0; i < language.length ; i++) { //변수선언 .length사용
			 System.out.print(language[i]); // 선언된 변수 출력
		 }
		 
		//---------------------------------------------------------
		 
		 int[] array1 = new int[10];
		 
		 for(int i = 0; i < array1.length; i++) {
			 array1[i] = i + 1;
			 
			 System.out.print(array1[i] + " ");
		 }
		 System.out.println();
		//---------------------------------------------------------
		 
		 int[] array2 = new int[10];
		 
		 for(int i = 0; i < array2.length; i++) {
			 array2[i] = array2.length - i;
		 }
		 for(int value : array2) {
			 System.out.print(value + " ");
		 }
		 System.out.println();
		 
		 
		 
	}
}
