package exam_multi_type_parameter;

public class Car{

	private String color;
	
	public Car() {}
	public Car(String color) {
		this.color = color;		
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return " [color : " + color + "]";
	}
	
}
