package exam_class_array;

public class SmartPhone {

	//필드 선언
	private String maker;
	private String name;
	private int price;
	private int discountRate;
	
	//제조사 접근자 설정자
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	//제품이름 접근자 설정자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//가격 접근자 설정자
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//할인율 접근자 설정자
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	// null 생성자 선언
	public SmartPhone() {} 
	// 3개 생성자 선언
	public SmartPhone(String maker, String name, int price) {
		this.maker = maker;
		this.name = name;
		this.price = price;
	}
	// 4개 생성자 선언
	public SmartPhone(String maker, String name, int price, int dr) {
		this.maker = maker;
		this.name = name;
		this.price = price;
		discountRate = dr;
	}
	
	// 출력 메서드
	public void phoneData() {
			System.out.format("%-15s[%s]\n가격:%,d\n",name,maker,price);
		}
	

}
	
	
	
	
	
	
