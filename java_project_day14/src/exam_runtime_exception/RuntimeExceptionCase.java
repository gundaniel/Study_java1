package exam_runtime_exception;

public class RuntimeExceptionCase {
	public static void main(String[]args) {
		//런타임 익셉션 종류  - 비체크 제외
	//----------------------------------------------------	
		//ArrayIndex 예외 발생
		try {
			int[] arr  = new int[3]; 
			arr[4] = 20; //예외 코드 = 배열[4]번째에 20을 대입으로 예외 발생
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	//----------------------------------------------------	
		//Class cast 예외 발생
		try {
			Object x = Integer.valueOf(0);			
			//부모클래스명 참조변수 = new 서브 클래스 생성자();  
			System.out.println((String) x);	//예외코드 = 잘못된 형변환으로 예외 발생
		}
		catch(ClassCastException e) {
			e.printStackTrace();
		}
	//----------------------------------------------------		
		//NegativeArray 예외 발생
		try {
			int [] arr = new int[-10]; // 배열이 음수일때 예외 발생
			System.out.println(arr.toString());
		}
		catch(NegativeArraySizeException e) {
			e.printStackTrace();
		}
	//----------------------------------------------------	
		//NumberFormat 예외 발생
		try {
			String data1 = "100";
			String data2 = "a100";
			
			int value1  = Integer.parseInt(data1);
			int value2  = Integer.parseInt(data2);
			
			int result = value1 + value2; // 스트링타입을 인트로 계산하여 예외 발생
			System.out.println(data1 + "+" + data2 + "+" + "=" + result);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
	}
}
