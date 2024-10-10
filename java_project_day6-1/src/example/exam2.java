package example;
import java.util.Scanner;
public class exam2 {
	public static void main(String[]args) {
		
	//문자열을 입력받아 하나하나 배열에 넣고 검색할 문자열에 찾을 문자가 몇개인지
	// 개수와 몇번째 인덱스에 있는지 인덱스를 출력
		
	/*[출력 예시]
	 * 문자열 : application
	 * 문자: i
	 * i가 존재하는 위치 : 
	 * i 개수
	 * 	 */
		Scanner input = new Scanner(System.in);
		
		String str = " ";
		char ch = '\u0000';
		char[] charArray = null;
		int count = 0;
		
		System.out.print("입력받을 문자열: ");
		str = input.nextLine();
		System.out.print("찾을 문자: ");
		ch = input.nextLine().charAt(0);
		
		charArray = new char[str.length()];
		
		for(int i = 0; i < charArray.length; i++) {
			charArray[i] = str.charAt(i);
		}
		
		System.out.print(str + "에" + ch + "가 존재하는 위치(인덱스)");
		
		for(int i = 0; i <charArray.length; i ++) {
			if(charArray[i] ==ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.print(ch +"의 개수: " + count);
		
		
		
		
		
		
		
		
		
		//for(int i = 0; i < moon[].length; i++);
		
		
		

		
		
		
		
		
	}
}
