package exam_method;

class RefSwap{
	
	public int x;
	
	
	public void change(RefSwap rs2) {
		System.out.println("\nBefore Change x= " + rs2.x); //2번 값 10
		
		rs2.x = 200;
		
		System.out.println("\nAfter Change x= "  + rs2.x); //3번 변경된 값 200
	}
}

	//출력 클레스 작성

public class RefSwapTest {
	
	public static void main(String[]args) {
		
		RefSwap rs = new RefSwap();
		
		rs.x = 10;
		
		System.out.println("\nmain Before Calling x= "  + rs.x); //1번 값 10
		
		rs.change(rs);
		
		System.out.println("\nmain After Calling x= "  + rs.x); // 4번 주소값이 동일함으로 변경된 값 200이 적용
		
	}

}
