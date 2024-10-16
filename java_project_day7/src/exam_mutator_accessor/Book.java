package exam_mutator_accessor;

public class Book {
	private String title;
	private int price;
	
	
	
	//title 접근자
	public String getTitle() {
		return title;
	}
	//title 설정자
	public void setTitle(String title) {
		this.title = title;
	}
	//price 접근자
	public int getPrice() {
		return price;
	}
	//price 설정자
	public void setPrice(int price) {
		this.price = price;
	}
	
	//출력메서드
	public String toString() {
		return "책제목: " + title + " 책가격: " + price;
	}
	
	
}
