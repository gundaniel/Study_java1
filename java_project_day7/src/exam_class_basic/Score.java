package exam_class_basic;

public class Score {

	// 성적을 출력하는 Score 클래스를 정의
	//이름 국어 영어 수학 총점 평균  (필드 구현)
	//플드에 값을 설정할 수 있는 기능 
	//합, 평균, 합점을 반환하는 기능
	//모든 필드를 출려할 수 있는 기능을 포함하도록 한다. (메서드 구현)
	
	public String studentName;
	public int kor;
	public int eng;
	public int mat;
	public int tot;
	
	public void scoreData(String name, int kor, int eng, int mat) { //필드 값 대입 매서드
		
		studentName = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void getTotal() {
		tot = kor + eng + mat;  
	}
	public double getAver() {
		return (double)tot/3;
	}
	
	public char getGrade() {
		
		char hak = '\0';
		double avg = getAver();
		
		if(avg > 100 || avg < 0) {
			System.out.print("점수를 올바르게 입력해주세요");
		}
			else if(avg >= 90){
				hak ='A';
			}
			else if(avg >= 80){
				hak ='B';
			}
			else if(avg >= 70){
				hak ='C';
			}
			else if(avg >= 60){
				hak ='D';
			}
			else {
				hak ='f';
			}
			return hak;	
	}
			
	public String toString() {
		return String.format("%s\t%d\t%d\t%d\t%d\t%.1f\t%c",studentName,kor,eng,mat,tot,getAver(),getGrade());
	}
			
}
	
		
	
	
	
	

