package exam_class;

public class TV {

	private String manufacturer;
	private int year;
	private int size;
	
	public TV() {
		
	}
	
	public TV(String manufacturer, int year, int size) {
		
		this.manufacturer = manufacturer;
		this.year = year;
		this.size = size;	
	}

	// manufacturer 설정자,접근자
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	//year 설정자, 접근자
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//size 설정자, 접근자
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	//public void show("lG",24,48);
	
	public void show(){
		System.out.format("%s에서 만든 %d년도 %d인치 TV",
				manufacturer,year,size);
	}
	
}
