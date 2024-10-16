package exam_method_overload;

public class OverloadClacTest {
	public static void main(String[]args) {
		
		OverloadCalc over = new OverloadCalc();
		
		//정수 오버로드 출력
		int i = over.plus(3,5);
		System.out.println("int의 합: " + i);
		
		// 실수(float)오버로드 출력
		float j = over.plus(1.5f, 5.3f);
		System.out.println("\nfloat의 합: " + j);
		
		//실수(double)오버로드 출력
		double b = over.plus(1.5, 5.3);
		System.out.println("\ndouble의 합: " + b);
		
		//가변길이 메서드 합
		int num = over.plus(3,4,5,6);
		System.out.println("\n가변인자의 합: " + num);
		
		//배열의 합
		int[] values1 = {1,2,3};
		int result = over.pluss(values1);
		System.out.println("\n배열을 매개변수로 갖는 매서드의 호출: " + result);

		//배열의 합2
		
		result = over.pluss(new int[] {2,3,4,5});
		System.out.println("\n배열을 매개변수로 갖는 매서드의 호출2: " + result);
		
		
		
	}
}
