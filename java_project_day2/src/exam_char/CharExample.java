package exam_char;

public class CharExample {
	public static void main(String[] args) {
		
		char c1 = 'A'; 				//문자를 직접 저장
		char c2 = 65; 				// 십진수로 저장
		char c3 = '\u0041';			 // 유니코드로 저장
		
		char c4 = '가'; 				//문자 저장
		char c5 = 44032; 			//십진수로 저장
		char c6 ='\uac00'; 			//16진수로 저장
		
		int uniCode = c1; 			//유니코드 얻기
		
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			
			System.out.println(c4);
			System.out.println(c5);
			System.out.println(c6);
			System.out.println(uniCode);

			char ch = '\uAE00';
			System.out.println(ch);
			uniCode = (int)ch;
			System.out.println(ch);





		
	}

}
