package exam_switch;
import java.util.Scanner;
public class CoffeePrice {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		String order;
		String menu = """ 
				
				--------------------------
				카푸치노, 까페라떼, 카라멜마끼아또
				아메리카노, 에스프레소
				--------------------------	
				""";
				//블록문 사용  """
		
		
			System.out.print("무슨 커피를 드릴까요?\n");
			System.out.printf(menu, "\n");
		order = input.nextLine();
		
		int price = 0;
		
		switch (order) {
			case "카푸치노": case "까페라떼": case"카라멜마끼아또":
			price = 3500;	
			break;
			
			case "아메리카노": case "에스프레소":
			price = 2000;
			break;
			
			default:
				System.out.print("메뉴에 없습니다.");
		}	
				

		if (price !=0) {
			System.out.print( order +"는" + price + "원입니다.");
		}
				
				
		input.close();
		
				
	}

}
