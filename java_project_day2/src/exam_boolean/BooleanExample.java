package exam_boolean;

public class BooleanExample {
	public static void main(String[]args) {
		
		boolean stop = false;
		
		if(stop) {			
			System.out.println("중지합니다");
		}
		else {
			System.out.println("시작합니다");
		}

		int x = 10;
		int y = 10;
		boolean result1 = (x == 20); 	//변수의 값이 20인가?
		boolean result2 = (x != 20); 	//변수의 값이 20이 아닌가?
		boolean result3 = (x >= 20); 	//변수의 값이 20보다 큰가?
		boolean result4 = (x <= 20); 	//변수의 값이 20보다 작은가?
		boolean result5 = (x == y); 

		
			System.out.println("result1= 변수의 값이 20인가? " + result1 + "입니다.");
			System.out.println("result2= 변수의 값이 20이 아닌가? " + result2 + "입니다.");
			System.out.println("result3= 변수의 값이 20보다 큰가? " + result3 + "입니다.");
			System.out.println("result4= 변수의 값이 20보다 작은가? " + result4 + "입니다.");
			System.out.println("result4= x는 y인가? " + result5 + "입니다.");

			
		
		}
	}


