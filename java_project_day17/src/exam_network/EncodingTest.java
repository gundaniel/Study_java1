package exam_network;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodingTest {
	public static void main(String[]args) {
		
		String strEncoding;
		try {
			strEncoding = URLEncoder.encode("JAVA 안 녕 하 세 요  . ! @ # $ % 1 2 3 4 5","utf-8");
			String strDecoding = URLDecoder.decode(strEncoding, "utf-8");
			
			System.out.println("인코딩 된 문자열 : " + strEncoding);
			System.out.println("디코딩 된 문자열 : " + strDecoding);
		}
		catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
