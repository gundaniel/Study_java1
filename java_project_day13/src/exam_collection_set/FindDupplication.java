package exam_collection_set;
import java.util.HashSet;
import java.util.Set;
public class FindDupplication {
	public static void main(String[]args) {
	/* 전체 문자에서 중복된 단어를 검출하는 프로그램을 작성하여 보자. (클래스명: FindDupplication)
	 * 이 예제 HashSet을 이용하여 코딩해 보세요.
	 * String[] sample = { "단어", "의미", "구절", "의미", "단락"};
	 *
	 * [출력 결과]
	 * 중복된 단어: 의미
	 * 단어 수 : 4
	 * 중복되지 않은 단어: [단락, 의미, 구절, 단어]
	 */
	
		String[] sample = { "단어", "의미", "구절", "의미", "단락"};
		
		Set<String> set = new HashSet<String>(); //해시셋
		for(String word : sample) {
			if(!set.add(word)) { //if(set.add(word) == false)와 동일 부정을 더 많이 씀 (true < = > false)
				System.out.println("중복된 단어: " + word);
			}
		}
		System.out.println("단어수 : " + set.size()); //출력될 단어의 개수
		System.out.println("중복되지 않은 단어 : " + set.toString());
	
	
	}
}