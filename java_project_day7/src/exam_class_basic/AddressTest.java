package exam_class_basic;

public class AddressTest {
	public static void main(String[]ars) {
		
		Address add = new Address();
		
		add.name = "김서건";
		add.address = "관악구 신림동";
		add.phone = "010-8297-3315";
		
		
		
		System.out.print(add.toString());
		
		add.addressData("김서건","관악구 신림동","010-8297-3315");
		add.printData();
		
		
		
		
		
		
	}
}
