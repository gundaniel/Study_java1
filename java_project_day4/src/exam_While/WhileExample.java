package exam_While;

public class WhileExample {
	public static void main(String[]args) {
		//1부터 5까지 출력하기
		
		int i= 1;
			System.out.print("1. 정수: ");
		while (i <= 5) {
			System.out.print(i++ + " "); 
			//i++;
		}
			System.out.println();
	//------------------------------------------------------------	
		i = 1;
			System.out.print("2. 정수: ");
		while (true) {                                 //true = 무조건 참으로 무한 반복인 상태
			System.out.print(i++ + " ");

			//i++;
			if(i>5) {
				break;
			}
		}
		
	//------------------------------------------------------------	
		int num =1 , sum = 0;
		while (num <=10) {
			//sum += num; = sum = sum +num과 동일
			//num++; = num = num + 1과 동일 
			
			sum += num++; //위 식을 합친 것
		}
			System.out.println(" ");
			System.out.printf("1부터 10까지의 합은" + sum + "입니다.");
			
	//------------------------------------------------------------	
		
	
	
	}
}
