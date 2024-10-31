package exam_class_array;

public class FruitTest {
	public static void main(String[]args) {
		
		int total = 0;
	
		Fruits fruits = new Fruits();
		
		System.out.println("=======과일 구입목록=======");
		fruits.fruitData();
			
		for(int i = 0; i < fruits.getPrice().length;i++) {
			total += fruits.getPrice()[i];
		}

		//합계와 할인 금액 선언
		double sale = total * 0.15;
		double total2 = total - sale;
		
		//총금액 출력
		System.out.printf("총금액:%,d원\n", total);
		System.out.printf("할인후 결재금액:%,d원" ,(int)total2);
		
		
		
		
		
		
	}
}
