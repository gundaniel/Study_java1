package exam_multi_type_parameter;

class Bag<T, C>{ //제네릭 타입 선언(타입 매개변수)
	//필드
	private T thing;
	private C category;
	// 생성자
	public Bag(T thing, C category) {
		this.thing = thing;
		this.category = category;
	}

	//thing 접근자 설정자
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}
	//category 접근자 설정자
	public C getCategory() {
		return category;
	}
	public void setCategory(C category) {
		this.category = category;
	}
	
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getSimpleName());
		System.out.println("C의 타입은 " + category.getClass().getSimpleName());
	}	
}

class Book{
	//필드 선언
	private String title;
	private String writer;
	//생성자 선언
	public Book() {}
	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}
	//출력 메서드 선언
	@Override
	public String toString() {
		return "Book [title= " + title + ", writer= "  + writer + "]";
	}
}

public class BagTest{
	public static void main(String[]args) {
		Bag<Book,String> bag = new Bag<>(new Book("자바 프로그래밍", "김철수" ), "IT");
		
		bag.showType();
		
		Book book = bag.getThing();
		String category = bag.getCategory();
		
		System.out.println("Thing is : " + book);
		System.out.println("category is : "  + category);
	}
}