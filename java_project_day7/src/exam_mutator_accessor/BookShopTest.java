package exam_mutator_accessor;

public class BookShopTest {
	public static void main(String[]args) {
		
		BookShop bs = new BookShop();

		System.out.println("<<값 대입>>");
		bs.bookShopData("그대들 어떻게살것인가", "요시노 겐자부로", 10800);
		
		System.out.println("책이름: " + bs.getTitle());
		System.out.println("저  자: " + bs.getAuthor());
		System.out.println("가  격: " + bs.getPrice());
		
		//-------------------------------------------------------
		
		BookShop bs2 = new BookShop();
		
		System.out.println("\n<<값 변경 후 출력>>");		
		bs2.setTitle("스즈메의 문단속");
		bs2.setAuthor("신카이 마코토");
		bs2.setPrice(30000);
	
		System.out.println(bs2.toString());
		
	}

}
