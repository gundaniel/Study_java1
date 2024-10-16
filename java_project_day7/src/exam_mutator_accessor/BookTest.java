package exam_mutator_accessor;
import java.util.Scanner;
public class BookTest {
	public static Scanner input = new Scanner(System.in);	
	public static void main (String[]args) {
		
		Book book1 = new Book();
		book1.setTitle("자바 프로그래밍");
		book1.setPrice(28000);
		System.out.print("책제목: " + book1.getTitle());
		System.out.println("책가격: " + book1.getPrice());
		
		//-------------------------------------------------
		
		Book book2 = new Book();
		System.out.println("책제목 입력: ");
		book2.setTitle(input.nextLine());
		System.out.println("책가격 입력: ");
		book2.setPrice(input.nextInt());
		input.nextLine();
		
		System.out.print(book2.toString());
		
		//-------------------------------------------------
		
		Book book3 = new Book();
		inputData(book3);
		System.out.println(book3.toString());	
}		
		//-------------------------------------------------
		
	public static void inputData(Book book) {
			
		System.out.print("책제목 입력: ");
		book.setTitle(input.nextLine());
		System.out.print("책가격 입력: ");
		book.setPrice(input.nextInt());
		input.nextLine();
		}
}
