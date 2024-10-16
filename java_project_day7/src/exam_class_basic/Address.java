package exam_class_basic;

public class Address {

	
	//주소록 클래스 
	
	public String name;
	public String address;
	public String phone;
	
	public void addressData(String n, String a, String p) {
		
		name = n;  //변수는 값
  		address = a;
		phone = p;
	}	
	public void printData() {
		//System.out.printf("%s, %s, %s\n", name, address, phone);
	}
		
	public String toString() {
		return String.format("%s, %-2s, %s\n", name, address, phone);
	}

}

