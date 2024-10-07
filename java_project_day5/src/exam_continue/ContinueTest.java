package exam_continue;

public class ContinueTest {
	public static void main(String[]args) {
	
	//--------------------------------------------------
		//1부터 10까지의 수 중에서 홀수를 출력해보자	
		int a =0;
	
		do {
			a++;
			if(a % 2 == 0) { 		// 2로나눈 나머지가 0일 때 
				continue;			// 짝수 일시 "system"을 만나지 않고 위로
			}
			System.out.printf("%5d" , a);
		}
		while(a < 10);{
		} 
		System.out.println();
	//--------------------------------------------------
	//1부터 10까지의 수 중에서 짝수를 출력해보자
	
		for(int b = 1; b <=10; b++) {
			if(b % 2 != 0) {  		// 2로나눈 나머지가 0일 때 
				continue; 			// 홀수 일시 "system"을 만나지 않고 위로
			}
				System.out.printf("%5d" , b);
		}

	}
}
	
