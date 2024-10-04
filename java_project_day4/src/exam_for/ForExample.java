package exam_for;

public class ForExample {
	public static void main(String[]args) {
		
	
		//[실습1]
		for (int i =1; i <= 5; i++) {
			System.out.print(i + ".");
			System.out.print("Hello World ");
			System.out.print("I love coding\n");
		}
			System.out.println();
	//----------------------------------------------------	
		//[실습2] 1부터 10까지의 합
		
		int sum = 0;

		for (int i =1; i <=10; i++){
		sum += i;                      //sum = sum + i 와 동일	
		}
			System.out.printf("1부터 10까지 정수의 합 = %d",sum);
			System.out.println();
	//----------------------------------------------------		
		//[실습3] "for"문을 이용해서 1부터 10까지의 정수중 3의 배수의 총합을 구하는 코드 작성
		
		sum = 0;
		for (int i =1; i <=10; i ++) {
			if(i %3 == 0) { //"i"를 3으로 나눈 나머지가 0인가?
				sum += i;  //sum = sum + i
			}	
		}
			System.out.println("3의 배수의 합:" + sum);
			System.out.println();
	}
}
