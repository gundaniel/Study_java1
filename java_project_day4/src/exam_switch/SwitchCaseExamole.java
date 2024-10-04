package exam_switch;
import java.util.Scanner;
public class SwitchCaseExamole {
	public static void main(String[]args) {
		//사용자에게 관리자, 회원, 비회원 중 하나를 입력받아 각 등급이 행할 수 있는 권한을 출려하세요.	
		//단 관리자는 회원관리 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		//회원은 게시글 작성, 게시글 조회, 댓글작성이 가능하고
		//비회원은 게시글 조회만 가능 합니다.
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("권한을 확인하고자 하는 등급:");
		switch(input.nextLine()) { 							//스위치문으로 입력을 바로 받을 수 있음*
		
			case "관리자": 									//break문을 입력하지 않음으로써 전부 다출력이 되게 처리
				System.out.println("회원관리, 게시글 관리");
			case "회원":
				System.out.println("게시글 작성,댓글 작성");
			case "비회원":
				System.out.println("게시글조회");
			break;
			
			default:
				System.out.println("잘못 입력하셨습니다.");
		}
		
		input.close();
		
		
		
		
		
	}
}
