package exam_collection_list;

public class Movie {
	private String mTitle;
	private Double mGrade;
	private String mActor;
	private String mYear;
	
	//생성자
	
	public Movie() {}
	public Movie(String mTitle, Double mGrade, String mActor, String mYear) {
		this.mTitle = mTitle;
		this.mGrade = mGrade;
		this.mActor = mActor;
		this.mYear = mYear;
	}
	//설정자 접근자
	public String getmTitle() {
		return mTitle;
	}
	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}
	public Double getmGrade() {
		return mGrade;
	}
	public void setmGrade(Double mGrade) {
		this.mGrade = mGrade;
	}
	public String getmActor() {
		return mActor;
	}
	public void setmActor(String mActor) {
		this.mActor = mActor;
	}
	public String getmYear() {
		return mYear;
	}
	public void setmYear(String mYear) {
		this.mYear = mYear;
	}
	
	public String toString() {
		return "[제목: " + mTitle + " 평점: " +  mGrade + " 주연배우: " + mActor + " 개봉년도: "  + mYear + "]"; 
		
	}
	
	
	
	
	
}
