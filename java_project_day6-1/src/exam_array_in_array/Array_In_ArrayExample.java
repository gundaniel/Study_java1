package exam_array_in_array;

public class Array_In_ArrayExample {
	public static void main(String[]args) {
		
		int[][] arr1 = new int[2][3];
		
		System.out.println("arr1.length = " + arr1.length); //배열 행의 수
		System.out.println("arr1.length = " + arr1[0].length); //0번째 행의 수 
		System.out.println("arr1.length = " + arr1[1].length); //1번째
		System.out.println();
		
		for(int i = 0; i <arr1.length; i++){
			for (int k = 0; k < arr1[i].length; k++) {
				System.out.print("arr1["+ i + "][" + k + "]=" + arr1[i][k] + " ");
			}	
			System.out.println();	
		}
		System.out.println();
		
		//---------------------------------------------------------
		
		int arr2[][] = new int[][] {{10,20,30},{40,50,60}};
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
			System.out.printf("%-5d",arr2[i][j]);
			}
			System.out.println();	
		}
		System.out.println();
		
		//---------------------------------------------------------
		
		int [][] arr3 = new int[2][];
		arr3[0] = new int[] {1, 5};
		arr3[1] = new int[3];
		for(int i = 0; i < arr3.length; i++){
			for(int k = 0; k < arr3[i].length; k++) {
			System.out.print("arr3[" + i + "][" + k + "]=" + arr3[i][k]);
			}
			System.out.println();
		}
		System.out.println();
		
		//---------------------------------------------------------
		
		int [][] array = new int[5][5];
		
		for(int i = 0, num =1; i < array.length; i++) {
			for(int j = 0; j <array[i].length; j++) {
				array[i][j] = num++;
			}
		}
		for(int i =0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				System.out.printf("%-5d", array[i][k]);
			}
			System.out.println();
		}
		System.out.println();
		
		//---------------------------------------------------------
		int sum = 0;
		for(int i = 0; i <array.length; i++) {
			for (int j =0; j < array[i].length; j++) {
				if (i ==j) {
					sum += array[i][j];
					//System.out.print(array[i][j] + "  \n"); // 대각선의 수가 바르게 나오는지 체크
				}
			}
		}System.out.println("합계 : " + sum);
		System.out.println();
		
		
		//---------------------------------------------------------
		int total = 0;
		for(int i = 0; i <array.length; i++) {
			for (int j =0; j <= i; j++) {
					total += array[i][j];
					System.out.print(array[i][j] + " "); // 대각선의 수가 바르게 나오는지 체크
			}
		}
		System.out.println("합계 : " + total);
		System.out.println();
	
	}
}
		
		
		
	
