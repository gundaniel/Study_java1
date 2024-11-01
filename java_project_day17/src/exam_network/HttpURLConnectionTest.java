package exam_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionTest {
	public static void main(String[]args) throws IOException {
		String site = "https://www.daegu.go.kr/icms/rss/feed.do?id=BBS_00064";
		
		URL url = new URL(site);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		System.out.println("문서의 타입: " + conn.getContentType());
		
		int resCode = conn.getResponseCode();
		System.out.println("응답코드 : " + resCode);
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer output = new StringBuffer();
		
		while((inputLine = in.readLine()) != null){
			output.append(inputLine);
			output.append("\n");			
		}
		in.close();
		System.out.println("\n-----------------문서내용-------------------");
		System.out.println(output);
	}
}
