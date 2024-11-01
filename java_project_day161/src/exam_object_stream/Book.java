package exam_object_stream;
import java.io.Serializable;
/*
Book 클래스를 캡슐화(EnCapsulation) 원칙에 맞춰서 구현하시오.

- 직렬화 선언한다.
- String 타입의 title 과 int 타입의 price 필드를 선언한다
- 기본 생성자와 매개변수 있는 생성자를 작성한다.
- 필드에 대한 getter 와 setter 작성한다.
- toString() 메소드를 오버라이딩하여 인스턴스변수의 값에 대한 문장을 작성하여 리턴한다.
*/
public class Book implements Serializable {
	//직렬화 선언
	static final long serialVersionUID = 1L;
	//필드 선언
	private String title;
	private int price;
	// 생성자 선언
	public Book() {}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	//접근자 설정자
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//출력메서드 선언
	@Override
	public String toString() {
		return "책 제목: " + title + "책 가격: " + price;
	}
	
	
	
	
	
}
