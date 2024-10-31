package exam_inputstream_read;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class InputOutputStreamExample {
    public static void main(String[] args) {
    	/*
    	 * "C:/Temp/intest.txt"를 생성한다. (직접 파일 생성)
    	 * 해당 파일에는 아래의 내용이 저장되어 있다.
    	 	Hello World!
    	 	My Name is IOStream.
    	 * 이 내용을 읽어 C:/Temp/outtest.txt파일을 생성하여 저장한다.
    	 * */
    	
    	/*//try~catch~finally문 이용. 
		FileInputStream fis = null;
		FileOutputStream fos = null;
	
		try {
			fis = new FileInputStream("C:/Temp/intest.txt");   // 원본 이미지 파일명 대체
			fos = new FileOutputStream("C:/Temp/outtest.txt"); // 복사할 이미지 파일명 대체
			int data = -1;

			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("파일 복사가 완료 되었습니다.");
		} catch (FileNotFoundException fnf) {
			System.out.println("파일이 존재하지 않거나 경로가 맞지 않아 더 이상 작업을 진행할 수 없습니다.");
			//fnf.printStackTrace();
		} catch (IOException io) {
			System.out.println("파일 입출력에 문제가 발생하여 더 이상의 작업을 진행할 수 없습니다.");
			//io.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류 발생으로 더 이상의 작업을 진행할 수 없습니다.");
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
	 	*/
		//------------------------------------------------------------------------
    	 //try-with-resources문 이용
        try (FileInputStream fis = new FileInputStream("C:/Temp/intest.txt"); // 해당경로의 해당파일을 읽어옴
        	FileOutputStream fos = new FileOutputStream("C:/Temp/outtest.txt")) { //파일을 복사하여 해당경로에 해당하는 이름으로 새로운 파일을 생성

            int data = -1;
            while((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("파일 복사가 완료 되었습니다.");
        } catch (FileNotFoundException fnf) {
            System.out.println("파일이 존재하지 않거나 경로가 맞지 않아 더 이상 작업을 진행할 수 없습니다.");
        } catch (IOException io) {
            System.out.println("파일 입출력에 문제가 발생하여 더 이상의 작업을 진행할 수 없습니다.");
        } catch (Exception e) {
            System.out.println("오류 발생으로 더 이상의 작업을 진행할 수 없습니다.");
        } 
    }
}