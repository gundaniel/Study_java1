package exam_array_in_array;

public class Array_In_ArrayExample2 {
	public static void main(String[]args) {
		
		int[][] num1= new int[4][4];
		int value= 16; //뺄 때 기본값을 얼마나 주느냐 확인
		//int value =1; 더할때 
		
		for(int i = 0; i < num1.length; i++) {
			for(int j = 0; j < num1.length; j++) {
				num1 [i][j] = value--; //여기서 더해줘야 숫자가 올라감 - 숫자를 빼면 숫자가 내려감
				//System.out.printf("%-5d" , num1[i][j]); 여기서 출력시 1자 배열 
			}
		}
		for(int i =0; i < num1.length; i++) {
			for (int k = 0; k < num1[i].length; k++) {
				System.out.printf("%-5d" , num1[i][k]);
			System.out.println();     //여기서 출력해야 원하는 배열에 맞게 출력됨
		}
		
		
		}	
	}
}
