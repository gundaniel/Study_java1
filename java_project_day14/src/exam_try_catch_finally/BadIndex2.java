package exam_try_catch_finally;

public class BadIndex2 {
	public static void main(String[] args) {
		
		//인덱스 번호를 잘못주었을 때 나오는 오류 확인 및 처리
		int[] array = new int[10];
		
		try {
			for (int i = 0; i < array.length; i++) {
				array[i] = i+1;
			}
			
			int result = array[12]; //예외 코드
			System.out.println(result);
			//예외 처리
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 잘못되었습니다.");
		}
			System.out.println("과연 이 문장이 실행될까요?");
	}
	
}