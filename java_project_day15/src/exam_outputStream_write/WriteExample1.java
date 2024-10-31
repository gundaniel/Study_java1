package exam_outputStream_write;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class WriteExample1 {
	public static void main(String[]args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:/temp/test.txt"); //txt 파일 생성
			/*byte [] data = "청혼하지 않을 이유를 못찾았어, I couldn't find a reason not to propose".getBytes(); // 파일안 내용 생성
			for(int i = 0; i < data.length; i++) {
				os.write(data[i]);
			} 
			*/

			/*byte[]data = "hello world".getBytes(); //배열의 값중 첫번째 인덱스부터 2개의 길이만큼만 가져오기
			os.write(data,1,2);
			*/
			
			byte[] data1 = "學而時習之, 不亦說乎兒 (학이시습지 불역열호아)".getBytes(); //내용 안 메시지 
			os.write(data1);
			
			System.out.println("파일 생성되었습니다."); //생성완료시 출력 메시지
		}
		catch (FileNotFoundException fnf) {
			System.out.println("저장할 폴더가 생성되어 있지 않습니다."); //폴더가 없을 경우 예외처리
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		finally{
			try {
				if(os != null) {
					os.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

