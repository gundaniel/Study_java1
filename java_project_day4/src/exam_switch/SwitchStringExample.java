package exam_switch;
import java.util.Scanner;
public class SwitchStringExample {
	public static void main(String[]args) {
		
	//아래와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "00메뉴입니다"를, 종료 번호를 누르면 
	//"프로그램을 종료합니다 를 출력하세요
		
		//[예제] 1.입력 2.수정 3.조회 4삭제 7종료
		
		Scanner input = new Scanner(System.in);
		
			String ch = " ";
			int menu;
			
				System.out.printf("메뉴 번호를 입력해주세요:","\n");
			menu = input.nextInt();
			input.nextLine();
		
			if(menu == 1 ||menu == 2 ||menu == 3||menu == 4 || menu == 7) {
				switch(menu) {
					case 1: ch = "입력";	
					break;
					case 2: ch = "수정";
					break;
					case 3: ch = "조회";
					break;
					case 4: ch = "삭제";
					break;
					case 7: System.out.println("프로그램을 종료합니다."); 
					
					input.close();
					return; //return을 통해 여기서 종료가능
				}
			 	System.out.printf("%s 메뉴입니다",ch);	 
			 }
			 else {
				 System.out.println("잘못된 입력입니다. 다시 입력해주세요."); 
			 }
	
			
	}
			  
}

