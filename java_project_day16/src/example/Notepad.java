package example;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Notepad  implements Serializable {
	private static final long serialVersionUID = 1L;
	private static Scanner input =  new Scanner(System.in);
	
	static String book; 
	static String newBook;
	static String out1;
	//메모
	private static void menu() {
		System.out.println("1. 메모 읽기");
		System.out.println("2. 새 세모");
		System.out.println("3. 종료");
		System.out.println("원하는 작업번호를 입력하세요");
	}
	//읽어오기 메서드
	private static void readMemo() throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader(book));
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		}
		catch(FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다 다시입력해주세요");
			return;
		}
	}
	//메모장 생성 메서드	
	private static void writeMemo() {
		File file = new File(newBook);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[]args) throws Exception {		
		
		while(true) {
			menu();
			int a =input.nextInt();
			input.nextLine();
		
			switch(a){
				case 1 :
					System.out.println("텍스트의 이름을 입력하세요");
					book = input.nextLine();
						readMemo();
					break;
					
				case 2 : 
					System.out.println("텍스트의 이름을 입력하세요");
					newBook = input.nextLine();
					writeMemo();
					System.out.println(newBook + " 으로 생성이 완료되었습니다.");
					System.out.println("메모를 작성해주세요");
					try (FileWriter writer = new FileWriter(newBook)){
						StringBuffer os = new StringBuffer();
						out1 = input.nextLine();
						os.append(out1);
						writer.write(os.toString());	
					}
					break;
										
				case 3: 
					System.out.println("시스템을 종료합니다");
					 return;
			}
		}
	}	
}
	