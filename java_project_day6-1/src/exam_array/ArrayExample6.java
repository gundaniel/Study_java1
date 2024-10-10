package exam_array;

public class ArrayExample6 {
	public static void main(String[] args) {
		
		//대열에 배입된 점수에 해당하는 막대그래프를 다음과같이 출력하시오
		
		int[] score = {90, 20, 50, 70, 65, 90, 100, 43, 55, 87}; //배열안 값 9개
		int count[]  = new int[10]; //공간 10개
		
		for(int i = 0; i < count.length; i ++){ //i가 10보다 작을때만 i를 더해라
			count[i] = score[i] / 10;  // 카운트 0 = 점수 1번 90 /10 = 9
		}
		
		for(int i = 0; i < score.length; i++){ //i가 점수의 길이보다 적을때 i를 더해라
			System.out.printf(" %4d 점 :" ,score[i]); //점수안 인덱스 순서 별로 출력
			for(int j = 0; j < count[i]; j++) { // j가 배열[0]보다 작을때 j를 더해라
				System.out.print("■"); 
			}
			System.out.print("\n");
		}
	
	}

}
