package exam_mutator_accessor;

public class ShoppingMallTest {
	public static void main(String[]args) {
		
		ShoppingMall sh = new ShoppingMall();
		sh.shopData("201803120001", "abc123", "2018년3월12일", "홍길순", "PD0345-12", "서울시 영등포구 여의도동 20번지");
		
		System.out.print(sh.toString());
		
		
	}
}
