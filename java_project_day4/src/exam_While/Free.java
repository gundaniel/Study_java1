package exam_While;
import java.util.Scanner;
public class Free {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		String a;
		String id;
		String pw;
		String id1;
		String pw1;
		String m = """
				---------------------------------------
				환영합니다(^_^)		                 	
				회원가입을 진행하시겠습니까?                 
				(y,n)                                 
				---------------------------------------
				=
				""";
		
		
			System.out.print(m);
			a = input.next();
			
			if(a.equals("y")) {
				System.out.printf("아이디를 입력하세요:","\n");
			id = input.next();
			input.nextLine();
				System.out.printf("패스워드를 입력하세요:","\n");
			pw = input.next();
			input.nextLine();
			
				System.out.printf("아이디는 %s,비밀번호는 %s이며, 회원가입이 완료되었습니다.\n", id, pw);
				System.out.printf("로그인 화면 입니다 id를 입력해주세요:");
			id1 = input.nextLine();
				System.out.print("패스워드를 입력하세요:");
			pw1 = input.nextLine();
			
				if(id.equals(id1) && pw.equals(pw1)) {
					System.out.printf("로그인이 완료되었습니다.");
				}
				else if(id.equals(id1) && !pw.equals(pw1)) {
					System.out.printf("비밀번호를 확인해주세요.");
				}
				else if(id != id1 && pw.equals(pw1)) {
					System.out.printf("아이디를 확인해주세요.");
				}	
				else if(id != id1 && pw !=pw1) {
					System.out.printf("다시한번 확인해주세요");	
				}else{
				}
			}	
			else if(a.equals("n")) {
				System.out.print("이용해주셔서 감사합니다");
			}
			else if((a !="y") && (a !="n")) {
				System.out.print("오류입니다");
			}	
				input.close();
		
	}
}
