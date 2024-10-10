package exam_array;

public class CharArrayExample {
	public static void main(String[]args) {
		
		char letter = 'A'; //유니코드 65
		char[] alphabet = new char [26];
		
		for(int i = 0; i < alphabet.length; i++) { //i가 알파벳보다 작을 때까지만 i를 증가시켜라
			alphabet[i] = (char) (letter +i);
		}
		
		System.out.println("대문자출력 :");
		for(char c :alphabet) {
			System.out.printf("%-2c",c); // = System.out.println(c + " ");

		}
		System.out.println();
		
		System.out.println("소문자출력 :");
		for(int i = 0; i < alphabet.length; i++) {
			System.out.printf("%-2c" , alphabet[i] + 32); // System.out.println((char)(alphabet[i] + 32) + " ");
		}	
		System.out.println();
		
		
		
		
		
	}
}
