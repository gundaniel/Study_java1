package exam_array;
public class MaxMinExample {
	public static void main(String[]args) {
		
		//다음 정수중에 12, 26, 68 ,98 , 76 ,54 ,8 , 6 , 4
		//가장 큰값 ,가장 작은 값을 출력해주세요 
		
		//[출력결과]
		// 최댓값 : 00 최솟값 : 00

		int[] score = {12, 26, 68, 98, 76, 54, 8, 6, 4}; 
		int max;
		int min;
		
		max = score[0];
		
		for(int i = 0; i < score.length; i++){ 
			if(max < score[i]) {	
				max = score[i];
			}
		}	
		min = score[0];
		
		for(int i = 0; i < score.length; i++){ 
			if(min > score[i]) {	
				min = score[i];
			}
		}System.out.print("가장큰수:" + max + " 가장작은수:" + min); 	
	}
}
		
		

