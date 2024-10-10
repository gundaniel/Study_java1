package exam_array_in_array;
public class Array_In_ArrayExample3 {

	public static void main(String[] args) {
	
		
		
		int[][] num1 = new int[5][5];
		int num2 = 1;
		int num3 = 0;
		int num4 = 0;
		
		
		
		for(int i = 0; i < num1.length; i ++) {
			for(int j = 0; j < num1.length; j ++) {
				// System.out.print(num1[i][j]);  == 25개인지 체크
				num1[i][j] = num2++;	
				
				num3 = num2;
			}
		}
		for(int i = 0; i < num1.length; i ++) {
			for(int j = 0; j < num1.length; j ++) {	
				
				System.out.printf("%-5d" ,num1[i][j]);
			}
			System.out.println();
		}
		System.out.printf("%-5d" ,num3);	
		
		
	}

}
