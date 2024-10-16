package exam_book;

public class Bus {
	
	//필드 생성 
	private int busNumber;
	private int passengerCount;
	private int money;
	
	//생성자 선언//
	
	//버스 번호를 받는 생성자
	public Bus(int busNumber) {  
		this.busNumber = busNumber;
	}
	//돈을 냈을때 받는 메서드
	public void take(int money) { 
		this.money += money;
		passengerCount++;
	}
	
	//출력 메서드
	public void busInfo() {
		System.out.printf("버스 %s번의 승객은 %d명이고, 금액은 %,d입니다.\n", busNumber, passengerCount, money);
	}
	

}
