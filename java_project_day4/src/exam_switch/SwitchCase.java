package exam_switch;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
	
		//미래건물의 각 층별 정보를 제공하고자 한다. 
		//1층은 약국, 2층은 정형외과, 3층은 피구봐, 4층은 치과, 5층은 헬스클럽이 입정하고있다. 
		//충수를 입력받아 정보를 출력해주세요
		
		//[출력예시]
		//각 층의 정보를 제공하고자 합니다. 층 수를 입력해주세요 
		//5층은 헬스클럽입니다.
		
		Scanner input = new Scanner(System.in);
		
			String info = " ";
			int floor = 0;
			
			System.out.printf("각 층의 정보를 제공하고자 합니다. 층수를 입력해주세요:","\n");
			floor = input.nextInt();
			
			
			//br
			
			if((floor <= 5) && (floor >= 1)) {
			switch(floor) {
			case 1 -> info = "약국"; 
			case 2 -> info = "정형외과";
			case 3 -> info = "피부과";
			case 4 -> info = "치과";
			case 5 -> info = "헬스클럽";
			}
				
			System.out.printf("%d층은 " + info + "입니다.",floor);
			}
			else {//((floor > 5) || (floor < 0)) 
				System.out.print("올바른 층을 입력해주세요.");
				
				
				
				
				/* switch(floor) {
			 
				case 1: 
					info = "약국";
					break;
				
				case 2:	
					info = "정형외과";
					break;
				
				case 3:	
					info = "피부과";
					break;
				
				case 4:	
					info = "치과";
					break;
				
				case 5:	
					info = "헬스클럽";
					break;
				
				default :
			}
			*/
				
			}
			input.close();
	}
}

	

