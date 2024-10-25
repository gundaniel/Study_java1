package exam_collection_list;

public class Apple {
	//필드 선언
	private String kind;
	private String color;
	
	//생성자 선언
	public Apple(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}
	//kind 접근자 설정자
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	//color 접근자 설정자
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	//출력 메서드 선언
	public String toString() {
		return "사과[품종: " + kind + ", 색상: " + color + "]";
	}
}