package exam_class;

public class Magazine extends Book {
	private String day;
	
	// 값4개 생성자
	public Magazine(String title,int page ,String author, String day ) {
		super(title,page,author);
		this.day = day;
	}
	
	//출력 메서드 (오버라이딩)
	@Override
	public String toString() {
		return super.toString() + "\n발매일: " + day;
	}
	
}
