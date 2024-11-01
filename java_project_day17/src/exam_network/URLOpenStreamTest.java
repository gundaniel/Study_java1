package exam_network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class URLOpenStreamTest {
	public static void main(String[]args) {
		BufferedReader in = null; // 입력
		PrintWriter out = null; // 출력
		try {
			URL url = new URL("https://www.hanbit.co.kr/media/");
			in = new BufferedReader(new InputStreamReader(url.openStream()));
			//InputStream -> InputStreamReader 로 바이트 스트림을 문자 스트림으로 변환
			out = new PrintWriter(new FileWriter("index.html"));
			String inLine;
			while((inLine = in.readLine()) != null) {
				out.println(inLine);
			}
			System.out.println("파일 복사 완료되었습니다");
		}
		catch(MalformedURLException e){
			System.out.println("URL ERROR");
		}
		catch(IOException i ) {
			System.out.println("IO ERROR");
		}
		finally {
			try {
				if(in != null) {in.close();}
			}
			catch(Exception e){
				System.out.println("CLOSE ERROR");
			}
		}
	}
}
