package exam_variable;

public class VariableInitializationExample {
	public static void main(String[] args) {
	
		int value;
		value = 10;
		int result = value + 10;
		
			System.out.println("value의 값은" + value +"이며, result의 값은" + result + "입니다.");
			
											//정수형 = %d, 문자형 = %c, 문자열형 = %s, 실수형 = %f
			
			System.out.printf("value의 값은%d이며,\nreuslt의 값은%d입니다\n",value, result);
			
		int sum1 = 1;
		int sum2 = 2;
		int sum3 = sum1 + sum2;
		int sum4 = sum1 + sum2 + sum3;
		
			System.out.printf("전부다 더한 값은%d입니다", sum4);
			
	
	
	
	}
}
