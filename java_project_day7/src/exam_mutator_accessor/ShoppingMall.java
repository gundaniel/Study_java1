package exam_mutator_accessor;

public class ShoppingMall {
	
	// --- 필드 생성 --- //
	private String num;
	private String id;
	private String day;
	private String name;
	private String formnum;
	private String address;
	
	//주문번호
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	//주문자 id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//주문날짜
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	//주문자이름
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//상품번호
	public String getFormnum() {
		return formnum;
	}
	public void setFormnum(String formnum) {
		this.formnum = formnum;
	}
	//배송주소
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//메서드 생성 
	public void shopData(String a, String b, String c,String d, String e, String f) {
	num = a;
	id = b;
	day = c;
	name = d;
	formnum = e;
	address = f;
	}
	
	//출력메서드 생성
	public String toString() {
		return String.format("주문번호 : %s\n주문자아이디: %s\n주문날짜: %s\n주문자이름: %s\n주문상품번호: %s\n배송주소:%s",
				num, id, day, name, formnum, address); 
	}
	
	
	
}
