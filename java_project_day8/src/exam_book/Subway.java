package exam_book;

public class Subway {

	//필드생성
	private String subwayNumber;
	private int passengerCount;
	private int money;
	
	//지하철 "n호선"을 받는 생성자
	public Subway(String subwayNumber) {  
			this.subwayNumber = subwayNumber;
		}
		//돈을 냈을때 받는 메서드
	public void take(int money) { 
			this.money += money;
			passengerCount++;
		}
		
		//출력 메서드
	public void subInfo() {
		System.out.printf("지하철 %s번의 승객은 %d명이고, 금액은 %,d입니다.\n",subwayNumber, passengerCount, money);
	}
	
		
}
