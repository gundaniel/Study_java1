package test;
import java.util.Scanner;
public class Example3 {

	public static void main(String[] args) {
		
		//수량 단가를 입력받아(수량*단가)계산후 25%할인하 원래금액, 할인액, 지불금액을 출력하는 프로그램을 작성하시오
		
		Scanner input = new Scanner(System.in);
		
			int num1;
			int price;
			String it;
			
					System.out.print("구매하실 물건의 이름을 입력해주세요:\n");
				it = input.nextLine();
		
		
					System.out.print("물건의 수량을 입력하시오: ");
				num1 = input.nextInt();
				input.nextLine();
		
					System.out.print("물건의 단가를 입력하시오: ");

				price= input.nextInt();
				input.nextLine();
		
		int plus = (num1 * price);
		double sale = ((num1 * price) * 0.25);
		double price2 = ((num1 * price)* 0.75);
		
		
					System.out.printf("%s의 금액은 %d원이며, \n", it, plus);
					System.out.printf("이 %s의 할인액은 %.0f원 입니다.\n", it, sale);
					System.out.printf("지불하실 금액은 %.0f원 입니다.", price2);
			
		input.close();
		
	
	}

}
