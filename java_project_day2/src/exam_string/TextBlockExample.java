package exam_string;
public class TextBlockExample {
	public static void main(String[]args) { 
	       
	
	//""" 텍스트 블록출력을 사용하면 문자 그대로 출력된다. 
		String str1 = "{\n" +
		"\t\"id\":\"javauser\"\n" +
		"\t\"name\":\"김서건\"\n" +
		"}";
			System.out.println(str1);
		
		String str2 = """
			{	
				"id":"javauser"
				"name":"김서건"
			}		
				""";
				
			
			System.out.println("-----------------------------------");
			System.out.println(str2);
			System.out.println("-----------------------------------");
			
										// 텍스트 출력블록 안에 \를 넣으면 줄바꿈이 되지 않고 같은 줄에 바로 출력된다.
		String str = """
					
		나는 자바를 \
		학습합니다.
		나는 자바의 고수가 될겁니다.		
		""";
			System.out.println(str);
			
		
	}
}

			

		
		
		
		
