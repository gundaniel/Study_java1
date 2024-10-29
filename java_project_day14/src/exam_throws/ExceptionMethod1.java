package exam_throws;
import java.io.IOException;
public class ExceptionMethod1 {
	public static void main(String[]args) {
		System.out.println(readString());
	}
	
	public static String readString() {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오: ");
		int readCount = 0;
		try {
			readCount =  System.in.read(buf);
			//자바 = 한글 한글자 -> 2byte or 3byte // 영문 한글자 1byte
			System.out.println("읽어들인 바이트 수 : " + readCount);
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		/*//배열 값 확인
		for (byte b: buf ){
		System.out.print(b + " ");
		}
		System.out.println();
		*/
		
		//String (바이트 배열, 위치정보, 길이수) :byte 배열의 값을 문자열로 생성
		return new String(buf, 0 , readCount - 2);
	}
}

