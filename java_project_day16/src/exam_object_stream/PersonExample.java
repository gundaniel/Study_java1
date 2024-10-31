package exam_object_stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
/*
- person.dat 파일에 Person 데이터를 저장 : output 메서드 생성
  전달받은 fileName으로 파일 출력 스트림을 생성한다.
  파일에 Person 객체를 기록할 수 있는 객체 출력 스트림을 추가한다.
  파일에 Person 객체 정보를 기록하고 스트림들을 닫는다.
  Person 객체 샘플 : "김희진", 20
  
- person.dat 파일에서 데이터로 읽어서 Person 복원하여 출력 : input 메서드 생성
*/
public class PersonExample {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[]args) {
		String fileName = "Person.dat";
		output(fileName);
		input(fileName);
	}
	
	private static void output(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos =new ObjectOutputStream(fos)) {
			System.out.print("이름: ");
			String name = input.nextLine();
			System.out.print("나이: ");
			int age = input.nextInt();
			input.nextLine();
			
			oos. writeObject(new Person(name, age));
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	private static void input(String fileName) {
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream oos = new ObjectInputStream(fis)){
			Person p = (Person) oos.readObject();
			System.out.println(p.toString());
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		}
		catch(IOException io ) {
			
		}
		
	}
}
