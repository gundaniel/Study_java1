package exam_throws;
import java.io.IOException;
public class ExceptionMethod2 {
	public static void main(String[]args) {
		try {
			System.out.println(readString());	
		}
		catch(IOException e) { //여기서 예외처리
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();	
		}
	}
	
	public static String readString() throws IOException{ // throws 예외처리
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오: ");
		int readCount = System.in.read(buf); //-> 예외처리가 필요함
		return new String(buf, 0, readCount - 2);
	}
}
