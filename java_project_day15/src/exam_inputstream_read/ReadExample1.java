package exam_inputstream_read;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {
	public static void main(String[]args) {
		InputStream is = null; //추상클래스 참조변수 = null;
		try {
			is = new FileInputStream("C:/Temp/test.txt");
			System.out.print("[읽어 들인 문자]");
		
			/*int readByte;
			while(true) {
				readByte = is.read();
				if(readByte == -1) break;
				System.out.println((char)readByte);
			}
			*/
		//----------------------------------------------------
			/*int readByteNo;
			byte[] readBytes = new byte[20];

			String data = "";
			while(true) {
				readByteNo = is.read(readBytes);
				System.out.println("읽은 바이트 수 : " + readByteNo);
				if(readByteNo == -1) break;
				data += new String(readBytes, 0 , readByteNo);
			}
			System.out.println(data);	
			 */
			//----------------------------------------------------
			int readByteNo;
			byte[] readBytes = new byte[10];
			// read 바이트 배열에 저장할 길이수는 5이고 배열의 저장 위치는 2번째부터.
			readByteNo = is.read(readBytes, 2, 5);
			System.out.println("리턴 바이트 수 : "+readByteNo);

			for(int i=0; i<readBytes.length; i++) {
				System.out.println((char)readBytes[i]);
			}
			
		//----------------------------------------------------
		//int readByteNo;
	 } catch(IOException io) { // FileNotFoundException은 IOException의 서브클래스이다.
         io.printStackTrace();
     } finally {
         try {
             if(is!=null) is.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 }
}