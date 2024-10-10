package exam_array_in_array;
import java.util.Scanner;
public class StudentArrayExample {
	public static void main(String[]args){
	
		//3명의 학생의 국어 영어 수학을 입력받아 총점과 평균을 출력하라
		
		/*Scanner input = new Scanner(System.in);
		
		int[][] test1 = new int [1][3];
		String[] subject = {"국어","영어","수학"};
		int score1 = 0;
		
		
		for(int i = 0; i < test1[0].length; i++) {
			for(int j = 0; j < subject.length; j++) {
				test1[0][i] += score1;
				System.out.println((i+1) + "번째 학생의" + subject[j] + "점수를 띄어쓰기 간격으로 입력해주세요:");
			score1 = input.nextInt();
			}
			System.out.println((i+1)+"번째학생의 " + subject[i] + "점수는" +test1[0][i]); */
		
		final int STUDENT = 3;
		final int SUBJECT = 3;
		
		int[][] score = new int[STUDENT][SUBJECT];
		String[] subjectName = {"국어" ,"영어", "수학"};
		int total = 0;
		
		
		Scanner input = new Scanner(System.in);
		
			System.out.print("3명의 학생 데이터 입력\n");
			for(int i = 0; i <STUDENT; i++) {
				for(int j = 0; j <SUBJECT; j++) {
				System.out.print((i+1)+ "번째 학생"+subjectName[j] + "성적을 입력하세요");
				score[i][j] = input.nextInt();
				}
		}
			input.close();
			
			System.out.println("3명의 학생 데이터 출력");
			System.out.println("국어\t영어\t수학\t총점\t평균");				
			System.out.println("------------------------");		
			for(int i = 0; i < STUDENT; i++) {
				total = 0;
				for(int j = 0; j <SUBJECT;j++) {
					total = score[i][j];
					System.out.printf("3d\t", score[i][j]);
				}	
				System.out.printf("3d\t%.1f\n",total, (double)total/SUBJECT);
				}
			
		
		
		
		}
	}
