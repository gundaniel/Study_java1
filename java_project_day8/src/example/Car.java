package example;

public class Car {
	private String color;
	private int account;
	
	//생성자 선언
	public Car(String color, int account) {
		this.color = color;
		this.account = account;
	}

	//접근자 생성
	public String getColor() {
		return color;
	}
	public int getAccount() {
		return account;
	}
	
	public String toString() {
		return String.format("[색상]%-10s[생산수량] %-10d",color , account);
	}
	
	
}