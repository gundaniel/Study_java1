package exam_field_init;

	class Television {
		public static String company = "Samsung";
		public static String model = "LCD";
		public static String info;
		
		static {
			info = company + "-" + model;
		}
	}

	class FieldInit {
		// 명시적 초기화
		static int sValue = 100;  // 클래스 필드
		int insValue = 20;			 // 인스턴스 필드
		
		
		// 초기화 블록으로 필드 초기화
		static {
			sValue = 300; // 클래스 필드 초기화(클래스 필드를 초기화하거나 프로그램 실행될 때 가장 먼저 처리할 작업 명시)
		}
		//-------------------------------------------
		{	int num1 = 9;
			int num2 = 8;
			insValue = num1 * num2; // 명시적 초기화
		}
		
		// 생성자로 필드 초기화
		public FieldInit() {
			insValue = 300; // 인스턴스 필드 초기화
		}
		//-------------------------------------------
	
		public void display() {
			System.out.println("sValue: " + sValue);
			System.out.println("insValue: " + insValue);
		}
	}

	public class FieldInitTest {
		public static void main(String[] args) {
			
			FieldInit obj = new FieldInit();
			obj.display();

			System.out.println(Television.info);
		}
	}
