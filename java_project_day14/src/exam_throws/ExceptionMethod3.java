package exam_throws;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionMethod3 {
	public static void main(String[]args) {
		FileInputStream fi = null;
		
		byte[] readBytes = new byte[6];
		int readByteNo;
		String data = "";
		
		System.out.println("[try~ catch~ finally 제어]");
		//예외처리
		try { 
			fi = new FileInputStream ("test.txt");  // 텍스트 파일 불러오기
			while(true) {
				readByteNo = fi.read(readBytes);
				// System.out.println("읽어들인 바이트 수 : " + readByteNo);
				if(readByteNo == -1) 
					break;
					data += new String(readBytes, 0, readByteNo);
				}
				System.out.println(data);
			}
		catch(FileNotFoundException fne) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(IOException io) {
			System.out.println("파일을 읽는 도중에 문제가 발생하였습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//예외처리
			try {									
				if(fi != null)
					fi.close();
			}
			catch(IOException e) {
				e.printStackTrace(); //예외발생 추적내용 콘솔에 출력하는 메서드
			}
		}
		System.out.println();
		
		data = "";
		try(FileInputStream fis = new FileInputStream("file.txt");){ // 없는 txt 파일 불러오기
			while (true) {
				readByteNo = fis.read(readBytes);
				if (readByteNo == -1) 
					break;
				data += new String(readBytes, 0, readByteNo);
			}
			System.out.println(data);
		} catch (Exception e) {
			System.out.println("파일이 존재하지 않거나 파일을 읽는 중에 문제가 발생하였습니다");
		} 
	}
}