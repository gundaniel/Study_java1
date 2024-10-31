package exam_file_stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
	public static void main(String[]args) {
		
    	//try~catch~finally문 이용. 
		
	/*	FileInputStream fis = null;
		FileOutputStream fos = null;
		
		int readByteNo;
		String originalFileName = "C:/Temp/cat.jpg";
		String tagetFileName = "C:/ImageTest/cat.jpg";
		try {
			fis = new FileInputStream(originalFileName);
			fos = new FileOutputStream(tagetFileName);
			
			byte[] readBytes = new byte[100];
			while((readByteNo = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0 , readByteNo);
			}
		}
		catch(IOException io) {
				io.printStackTrace();
				System.out.println("입출력에 문제가 있어 더 이상 복사 작업을 진행할 수 없습니다.");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("입출력시 오류 발생으로 복사 작업을 진행할 수 없습니다.");
		}
		finally {
			try {
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			}
			catch(IOException e){
					e.printStackTrace();
			}
		}
		System.out.println("복사가 잘 되었습니다.");
		*/
	//-------------------------------------------------------------------
		
		//try-with-resources문 이용
		
		int readByteNo;
        try (FileInputStream fis = new FileInputStream("C:/Temp/cat.jpg"); // 해당경로의 해당파일을 읽어옴
        	FileOutputStream fos = new FileOutputStream("C:/ImageTest/cat.jpg")) { //파일을 복사하여 해당경로에 해당하는 이름으로 새로운 파일을 생성

        	byte[] readBytes = new byte[100];
			while((readByteNo = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0 , readByteNo);
			}
            System.out.println("파일 복사가 완료 되었습니다.");
        } 
        catch (IOException io) {
            System.out.println("파일 입출력에 문제가 발생하여 더 이상의 작업을 진행할 수 없습니다.");
        } 
        catch (Exception e) {
            System.out.println("오류 발생으로 더 이상의 작업을 진행할 수 없습니다.");
        } 
			
	}
}

