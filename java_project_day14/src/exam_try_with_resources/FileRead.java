package exam_try_with_resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) {
		// try-with-resources 
		try (FileInputStream fi = new FileInputStream("file.txt")) {
			int c = fi.read();
			System.out.println((char) c);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// try ~ catch ~ finally
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("file.txt");
			int c = fi.read();
			System.out.println((char) c);
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(fi != null) fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
}