package exam_array_in_array;

public class Rainfall {
	public static void main(String[]args) {
		
		//다음 프로그램은 3년동안 분기 강수량을 다음의 데이터를 활용하여 초기화하고
		//연도별 강수량과 합을 출력하는 프로그램을 작성하라
		
		/* 0        1         2         3        4(총합)
		 * 368.1  586.1     351.2     66.5      0    <- 18 년도
		 * 173.9  493		448.4	 168.1		0    <- 19 년도
		 * 172.8  1012.4	259.4	 46.7       0	 <- 20 년도
		 */
		
		final int YEARS = 3;
		final int QUARTERS = 5; //4분기  + 총합
		
		//기상청 데이터 활용하여 2차원 배열 초기화
		double[][] rain = new double[][] {
			{368.1, 586.5,351.2,66.5, 0},
			{173.9,493,448.4,168.1, 0},
			{17.28,1012.4,259.4,46.7, 0}
		};
			
		for(int y = 0; y <YEARS; y++) { 			// y는 0인데 y가 YEARS보다 작을때까지 y를 더해라 -> 바깥 for = 3번 반복
			for(int q = 0; q < QUARTERS; q++) {  	// q는 0인데 q가 쿼터보다 작을때까지 q를 더해라 ->안쪽 for = 5번 반복 
				rain[y][QUARTERS-1] += rain[y][q];  //  = 마지막 4번열을 자름 // 레인 0 번행에서 1번열의 1개 적게 += 기존 레인 배열의 열을 대입
			}			
		}
		
		String[] year = {"2018", "2019", "2020"};
		String[] subject = {"년도","1분기","2분기","3분기","4분기","총합"};
		for(String sub :subject) { // 서브젝트배열에 있는 문자열을 섭에다 대입 = 마무리 할때까지 반복
			System.out.printf("%s\t", sub); // \t = 탭만큼 띄워라, 대입된 subject의 값이 출력
		}
		System.out.printf("\n--------------------------------------------");
		
		for(int y = 0; y <YEARS; y++) { // 
			System.out.print("\n" + year[y] + "년도\t");
			for(int q=0; q < QUARTERS; q++) {
				System.out.printf("%.1f\t",rain[y][q]);
			}
			System.out.println();
		}
		
	
	}		
}

