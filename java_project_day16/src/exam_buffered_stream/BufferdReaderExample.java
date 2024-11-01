package exam_buffered_stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferdReaderExample {
	public static void main(String[]args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력 : ");
		String lineString = br.readLine();
		
		System.out.println("출력 : " + lineString);
	}
}
