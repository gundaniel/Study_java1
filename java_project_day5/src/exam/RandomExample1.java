package exam;

public class RandomExample1 {
	public static void main(String[]args) {
	
		/* 50개의 난수를 만들어 "for문"과 "if문"사용
		 * 다음과 같이 출력하시오.
		 * 
		 *  [조건]
		 *  난수의 값의 범위 1-100
		 *  1줄에 6개씩 나오도록 제어
		 *  그 난수의 합도 마지막에 출력되도록 한다		   
		 */
		
		
		int num = 0;
		int sum = 0;
		
		for(int i = 1; i <=8; i++) {
			for(int j = 1; j <= 6; j++) {
				
				if(i == 8) {
					j +=2;
				}
					num = ((int)(Math.random()*100)+1);
					System.out.printf("%-2d ", num);
					sum += num;
			}
				System.out.println();
		}
			System.out.println("난수의 총합은" + sum + "입니다.");
	}
		
}
