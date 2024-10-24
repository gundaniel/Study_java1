package exam_generic_type;

public class Box<T> { //접근제어자 class 클래스명<매개변수 타입>{}
	//필드
	private T data;
	
	//생성자
	public Box() {}
	public Box(T data) {
		this.data = data;
	}
	//설정자
	public void set(T data) {
		this.data = data;
	}
	//접근자
	public T get() {
		return data;
	}

} 
