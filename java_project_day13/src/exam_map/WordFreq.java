package exam_map;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class WordFreq {
	public static void main(String[]args) {
	/* 클래스명 : WordFreq
	 * 문자열에 포함된 단어의 빈도를 계산하여 단어를 Key 로, 빈도를 Value 로 저장하여 출력해 보세요.
	 * String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem"};
	 *
	 * [실행결과]
	 * 총 단어 수 : 7개
	 * {a=1, not=1, be=2, or=1, problem=1, is=1, to=2}
	 */
	
		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem"};
		Map<String, Integer> m = new HashMap<String, Integer>();
		for (String a: sample) {
			Integer freg = m.get(a);
		m.put( a, (freg == null) ? 1: freg +1);
		}
		System.out.printf("총 단어수 : %d개 \n", m.size());
		System.out.println(m.toString());
	
		TreeMap<String, Student> tMap = new TreeMap<String, Student>();
		tMap.put("1" , new Student(94010001, "홍길동"));
		tMap.put("4" , new Student(95020001, "김희진"));
		tMap.put("2" , new Student(97010001, "윤도희"));
		tMap.put("3" , new Student(99030003, "김철수"));

		for(String key : tMap.keySet()) {
			System.out.println(key + " " + tMap.get(key));
		}
		System.out.println();
	
		TreeMap<Student ,Integer> sMap = new TreeMap<Student , Integer>();
		sMap.put(new Student(97010001, "윤도희"), 89);
		sMap.put(new Student(95020001, "김희진"), 90);
		sMap.put(new Student(94010001, "홍길동"), 99);
		sMap.put(new Student(99030003, "김철수"), 79);
		
		for (Map.Entry<Student, Integer> sd : sMap.entrySet()) {
			Student key = sd.getKey();
			Integer value = sd.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}

	}
}
