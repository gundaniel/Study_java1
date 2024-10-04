package exam_While;

public class WhileExample1 {
	public static void main(String[]args) {
		
	
		// 1부터 100까지의 짝수의 합과 홀수의 합을 구하시오
		
		int num = 0;
		int num1= 0;
		int sum = 0;
		int sum1 = 0;
		
		
		while(num <= 100 && num < 100){
			
			num++;
			num1++;
			
			if(num %2 ==1) {		
			sum += num;
				//System.out.println(num + "는 홀수입니다.");	
			}
			else if(num1 %2 ==0) {
				sum1 += num1;
				//System.out.println(num1 + "는 짝수입니다.");	
			
			}
		
			
		}
		System.out.printf("짝수의 합은 %d이며, 홀수의 합은 %d입니다." , sum, sum1);
		
	}
}
