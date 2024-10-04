package exam_While;

public class DoWhileExample {
	public static void main(String[]args) {
		
		int num = 0;
		
		do {
			System.out.println("num의 값 " + num);
		num++;	
		}
		while (num < 0);
			System.out.println();
			
	//---------------------------------------------------	
			//1부터 10까지 출력
			
		int i = 1;
		do {
			System.out.print(i + " ");
		i++;
		}
		while (i <= 10);
			System.out.println();
			
	//---------------------------------------------------	
			//10에서 1까지 출력	
		
		i = 10;
		do {
			System.out.print(i + " ");
		i--;
		}
		while (i > 0);
			System.out.println();	
			
	//---------------------------------------------------	
		//1에서 100까지의 합을 출력해주세요 do while문을 이용하여
			
		int number = 1, sum = 0;
		
		do {
			sum += number++;	// = sum = sum + number++;
		}
		while(number <= 100);
			System.out.println("1부터 100까지의 합: " + sum);
			System.out.println();
			
			
			
	}
}
