package exam_mutator_accessor;

public class BookShop {

	private String title;
	private String author;
	private int price;
	
	//title 접근자
	public String getTitle() {
		return title;
	}
	//title 설정자
	public void setTitle(String title) {  //설정자에는 매개 변수가 반드시존재해야 함
		this.title = title;
	}
	//author 접근자
	public String getAuthor() {
		return author;
	}
	//author 설정자
	public void setAuthor(String author) {
		this.author = author;
	}
	//price 접근자
	public int getPrice() {
		return price;
	}
	//price 설정자
	public void setPrice(int price) {
		this.price = price;
	}
	
	//필드값 정의 메서드
	public void bookShopData(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//출력 메서드
	public String toString() {
		return String.format("책이름: %s\n저  자:%s\n가  격:%,d\n",title,author,price);
	}
	
	
}
