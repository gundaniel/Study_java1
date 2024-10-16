package exam_mutator_accessor;
import java.util.Scanner;
public class ScoreTest {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[]args) {
			
		
		Score s1 = new Score();
		inputData(s1);	
			
		Score s2 = new Score();
		inputData(s2);
			
		Score s3 = new Score();
		inputData(s3);

		System.out.println("================================================");
		String[] subject = {"이름","국어","영어","수학","총점","평균","학점"};
		for(int i = 0; i < subject.length; i++) {
				System.out.printf("%s\t", subject[i]);
		}
		System.out.println("\n================================================");
		System.out.println(s1.toString());	
		System.out.println(s2.toString());	
		System.out.println(s3.toString());			
	}	
		
	public static void inputData(Score score) {
				
		System.out.print("학생의 이름을 입력하세요");
		score.setStudentName(input.nextLine());
		System.out.print("학생의 국어점수를 입력하세요");
		score.setKor(input.nextInt());
		input.nextLine();
		System.out.print("학생의 영어점수를 입력하세요");
		score.setEng(input.nextInt());
		input.nextLine();
		System.out.print("학생의 수학점수를 입력하세요");
		score.setMat(input.nextInt());
		input.nextLine();
	}
		

			
}



