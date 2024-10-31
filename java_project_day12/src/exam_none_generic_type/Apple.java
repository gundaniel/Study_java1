package exam_none_generic_type;
public class Apple {
	// "color"를 필드로 갖는 Apple 클래스를 생성하여
	// Box 클래스에 설정하여 보자.
	
	//필드
	private String color;

	//생성자
	public Apple() {}
	public Apple(String color) {
		this.color = color;
	}
	
	//접근자, 설정자
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Apple [color = " + color + " ]";
	}
	
}
