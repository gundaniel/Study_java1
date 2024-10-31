package exam_class;

public class Book {
	private String title;
	private int page;
	private String author;
	
	//제목 접근 설정자
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//페이지수 접근 설정자
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	//저자 접근 설정자
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//생성자 선언
	public Book(String title, int page, String author) {
		this.title = title;
		this.page = page;
		this.author = author;		
	}
	
	//출력메서드 선언
	public String toString() {
		return "책이름 : " + title + "\n페이지수: " + page + "\n저자: " + author;
	}
	
	
}
