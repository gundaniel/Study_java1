package exam_continue;
public class ContinueExample {
	public static void main(String[]args) {
		
		/* 문자열을 대상으로 
		 * 반복하며 문자 n이 나타나는 횟수를 카운티한다.
		 * 만약 현재의 문자가 n이 아니면 continue에 의하여
		 * 루프의 나머지 부분을 생략하고 다음 문자를 처리하도록 한다. 
		 * 
		 * [참고]문자의 길이는 문자열변수명.length()로 얻을 수 있으며
		 * 문자열 변수명 charAt(0)을 사용하면 문자열에서 첫번째 글자를 반환한다.
		 */
		
		int n = 0;
		
		String s = "no news is good news";
		
		//System.out.println(m.length());
		
			System.out.println("문자의 수:" + s.length());
	
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			
			if(s.charAt(i) != 'n'){
				continue;
			}	
			n++;
		}
		System.out.printf("\nn의 개수:" + n);
	}
}
