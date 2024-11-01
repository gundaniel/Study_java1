package exam_network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
public class DownloadImage {
	public static void main(String[]args) {
		InputStream in = null;
		OutputStream out = null;
		int readByteNo;
		String website = "https://postfiles.pstatic.net/MjAyNDA4MDlfMTUy/MDAxNzIzMTkzOTU1ODkz.pBLkXEuK7dmIgV34JAKmt2LOjOluHB6k-_T2i4CQ9Xsg.dRsjGByR67t2jtjsvYM82M0T42GB9Z0wnZ-9iyllAx8g.JPEG/1E7A3564.JPG?type=w466";
		
		try {
			URL url =new URL(website);
			URLConnection con = url.openConnection();
			in = new BufferedInputStream(con.getInputStream());
			
			out = new BufferedOutputStream(new FileOutputStream("dog1.jpg"));
			
			byte[] data = new byte[2048];
			while( (readByteNo = in.read(data)) != -1) {
				out.write(data, 0 , readByteNo);
			}
			System.out.println(website + "에서 이미지 다운로드를 완료하였습니다");
		}
		catch(MalformedURLException e) {
			System.out.println("URL ERROR");
		}
		catch(IOException i) {
			System.out.println("IO ERROR");
		}
		finally {
			try {
				if(out != null)
					out.close();
				if(in != null)
					in.close();
			}
			catch(Exception e) {
				System.out.println("CLOSE ERROR");
			}
		}
		
		
		
		
		
	}
}
