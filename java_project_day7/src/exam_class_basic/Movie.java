package exam_class_basic;

public class Movie {
	
	public String movieName;
	public String mDirector;
	public int runningTime;
	
	public void movieData(String name, String director, int rTime) {
		movieName = name;
		mDirector = director; 	//선언되었던 변수를 movie 선언으로 변경
		runningTime = rTime;
	}
	
	public String toString() {
		return "영화이름은 " + movieName + ", 감독은 " + mDirector + "이며, " //1번 출력예시
				+ "러닝타임은 " + runningTime + "분 입니다.";
	}
	public void printData() { 
			System.out.println("영화이름은 " + movieName + ", 감독은 " + mDirector + "이며, " //1번 출력예시
					+ "러닝타임은 " + runningTime + "분 입니다.");
	}  
}

