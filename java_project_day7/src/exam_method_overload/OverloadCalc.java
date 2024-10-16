package exam_method_overload;

public class OverloadCalc {
	//메서드오버로드 선언하기

	//정수타입 오버로드
	public int plus(int a, int b) {
		System.out.println("plus(int a, int b)");
		return a+b;
	}
	//실수(float)타입 오버로드
	public float plus(float a, float b) {
		System.out.println("plus(float a, float b)");
		return a+b;
	}
	//실수(double)타입 오버로드
	public double plus (double a, double b) {
		System.out.println("plus(dluble a, dloble b)");
		return a+b;
	}
	
	//가변길이 인자 타입
	public int plus(int ... c) {
		System.out.println("plus(가변길이 메서드 호출)");
		int sum = 0;
		for(int i = 0; i  < c.length; i++) {
			sum += c[i];
		}
		return sum;
	}
	public int pluss(int []v){
		int sum = 0;
		for(int i = 0; i  < v.length; i++) {
			sum += v[i];
		}
		return sum;
	}
	
	
	
}
