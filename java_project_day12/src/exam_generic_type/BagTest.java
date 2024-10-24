package exam_generic_type;

class Bag<T>{ //제네릭 타입 선언
	//필드
	private T thing;
	//생성자
	public Bag(T thing) {
		this.thing = thing;
	}	
	//접근자 설정자
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getSimpleName());
	}
}

class Book{ 
	
	private String title;
	private String writer;
	
	//생성자 선언
	public Book() {}
	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}
	
	//출력메서드 재정의
	@Override
	public String toString() {
		return "Book [title= " + title + ", writer= " + writer + "]";		
	}
}

class PencilCase{
	//필드
	private String brand;
	private String kind;
	//생성자 선언
	public PencilCase() {}
	public PencilCase(String brand, String kind) {
		this.brand = brand;
		this.kind = kind;
	}
	
	//출력메서드 
	@Override
	public String toString() {
		return "PencilCase [brand= " + brand + ", kind= " + kind + "]";
	}	
	
}
class NoteBook{
	private String make;
	private String size;
	
	public NoteBook() {}
	public NoteBook(String make, String size) {
		this.make = make;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "NoteBook [make = " + make + ", size = " + size + "]";
	}
}


public class BagTest{
	public static void main(String[]args) {
		Bag<Book> bag = new Bag<>(new Book("마음의 세탁소","황웅근"));
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase("룬룬필통","시크 그레이"));
		Bag<NoteBook> bag3 = new Bag<>(new NoteBook("모닝글로리","A4"));
		
		bag.showType();
		bag2.showType();
		bag3.showType();

		//bag = bag2;
		System.out.println(bag.getThing().toString());
		System.out.println(bag2.getThing().toString());
		System.out.println(bag3.getThing().toString());
	
	}
}