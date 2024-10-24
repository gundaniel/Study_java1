package exam_multi_type_parameter;

public class TV {

	private int size;
	
	public TV() {}
	public TV( int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
public String toString() {
	return "[size : " + size + "인치]";
	
}
	
}
