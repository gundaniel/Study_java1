package exam_object_stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.File;

/* 실행 클래스명: BookExample
 * 아래의 메서드는 static 을 가지지 않는 일반 메서드로 설정해 주세요.
 * 
 * - book.dat 파일에 Book 데이터를 저장 : fileSave 메서드 생성
 * 전달받은 fileName으로 파일 출력 스트림을 생성한다.
 * 파일에 Book 객체를 기록할 수 있는 객체 출력 스트림을 추가한다.
 * 파일에 Book 객체 정보를 기록하고 스트림들을 닫는다.
 * Book 객체 샘플 : "자바를 정복하자", 35000
 * 
 * - book.dat 파일에서 데이터로 읽어서 Book 객체로 복원하여 출력 : fileRead 메서드 생성
*/
public class BookExample {
	public static void main(String[]args) {
		BookExample bookTest = new BookExample();  //인스턴스 생성 (메서드가 정적이 아닐시)
		bookTest.fileSave("book.dat");	 //정적이 아니기에 인스턴스를 생성해줘야 함
		System.out.println("book.dat 파일 생성완료"); //제대로 생성이 되었는지 확인용
	}
	public void fileSave(String fileName) { //메서드 생성
		File file = new File(fileName); // 인스턴스를 생성하여 outputStream에 입력
			try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) { //입력가능
				oos. writeObject(new Book("자바를 정복하자", 35000)); //writeObject로 직렬화 하여 저장
			}
			catch(IOException e) {  //내려갈수록 상위Exception으로 선언
				e.printStackTrace(); //예외처리사항을 찾아줌
			}	
	}
	public void fileRead(String fileName) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){ //객체 생성없이 바로 이름을 줄수 있음
			Book book = (Book) ois.readObject();  
			System.out.println(book.toString()); 
		}
		catch(Exception e){
			
		}
	}
	
}



