package exam_method;

class PrimitiveSwap{
	
	//기초형의 값 전달
	public void change(int x, int y) {
		System.out.println("\nBefore Change X =" + x + " Y =" + y);
	
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("\nAfter Change X =" + x + " Y =" + y);
	}
}

	//출력 클래스 작성
public class PrimitveSwapTest {
	public static void main(String[]args) {
		
		PrimitiveSwap ps = new PrimitiveSwap();
		
		int x =10;
		int y = 20;
		
		System.out.println("\n호출전 main X =" + x + " Y =" + y);		
		
		ps.change(x,y);
		
		System.out.println("\n호출후 main X =" + x + " Y =" + y); //메서드를 벗어남으로서 값이 기존으로 바뀜
		
	
	
	}
}
