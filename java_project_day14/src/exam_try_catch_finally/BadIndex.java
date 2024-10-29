package exam_try_catch_finally;

public class BadIndex {
	
	//인덱스 번호를 잘못주었을 때 나오는 오류 확인 및 처리
	public static void main(String[]args) {
		int[] array = new int[10];
		
		for(int  i = 0; i < 10; i++) {
			array[i] = i+1;
		}
		//예외코드 실행
		int result = array[10]; //예외 코드
		System.out.println(result);
		System.out.println("과연 이문장이 실행될까요?");	
	}
}
