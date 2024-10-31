package exam_class_basic;

public class ScoreTest {
	public static void main(String[]args) {
		
		
		Score s1 = new Score();
		s1.scoreData("홍길동",90,75,61);
		s1.getTotal();
		
		Score s2 = new Score();
		s2.scoreData("김철수",80,75,61);
		s2.getTotal();
		
		Score s3 = new Score();
		s3.scoreData("이진희",90,75,61);
		s3.getTotal();
		
		System.out.println("===========================================");
		String[] subject = {"이름","국어","영어","수학","총점","평균","학점"};
		for(int i = 0; i < subject.length; i++) {
			System.out.printf("%s\t", subject[i]);
		}
		System.out.println("\n===========================================");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}
