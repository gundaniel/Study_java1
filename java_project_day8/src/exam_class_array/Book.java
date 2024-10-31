package exam_class_array;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {}
	
	//생성자 생성
	public Book(String bookName, String author) {
		
		this.bookName = bookName;
		this.author = author;
	}
	
	//bookName 접근자, 설정자
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	// author 접근자, 설정자
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//필드 값 출력
	public void showBookInfo() {
		System.out.print(bookName + ", " + author);
	}
	
	public String toString() {
		return bookName + ", " + author; 
	}	

}
