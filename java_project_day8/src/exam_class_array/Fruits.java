package exam_class_array;

public class Fruits {

	private String[] fruit = {"banana", "strawberry","persimmon","cherry"};
	private int[] price = {4800, 21000, 19000, 12000};
	
	//생성자 생성
	public Fruits() {}
	public Fruits(String[] fruit, int[] price) {
		this.fruit = fruit;
		this.price = price;
	}
	
	//과일 접근자 설정자
 	public String[] getFruit() {
		return fruit;
	}
	public void setFruit(String[] fruit) {
		this.fruit = fruit;
	}	//가격 접근자 생성자
	//가격 접근자 설정자
	public int[] getPrice() {
		return price;
	}
	public void setPrice(int[] price) {
		this.price = price;
	}

	//출력 메서드
	public void fruitData() {
		for(int i = 0; i < fruit.length; i++) {
			System.out.format("%-10s : %,d원\n",fruit[i] , price[i]); //-의 의미는 글자의 뒤로 체운다 
		}
	}
	
	
}
