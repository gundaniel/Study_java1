package exam_array;

public class SchoolCafeteriaExample {
	public static void main(String[]args) {
		
		// 20명의 학생에게 학교식당에대한 만족도 조사처리 프로그램이다
		//3단계로 나누어 (1)불만족 (2) 보통 (3) 만족 의 결과가
		// 다음 표와 같을때 만족도별 응답횟수를 출력하는 코드를 작성하시오
		
		 //1 2 1 2 3 1 2 2 3 1
		 //3 3 1 1 1 2 3 1 3 2
		
		int[] student = {1,2,1,2,3,1,2,2,3,1,3,3,1,1,1,2,3,1,3,2};
		int[] respons = new int[3];
		
		int i;
		
		for(i = 0; i < student.length; i++) {
			if(student[i] == 1) {
				respons[0]++;
			}
			else if(student[i] == 2) {
				respons[1]++;
			}
			else if(student[i] == 3) {
				respons[2]++;
			}
		}
		
		i = 0;
		
		System.out.println("불만:" + respons[0] + "명 보통:" + respons[1] + "명 만족:" + respons[2] + "명") ;
		System.out.printf("불만:%d명 보통:%d명 만족:%d명", respons[i], respons[i+1], respons[i+2]) ;
	}

}
