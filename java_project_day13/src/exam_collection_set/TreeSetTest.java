package exam_collection_set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Score implements Comparable<Score>{
	private int kor;
	private int math;
	
	//생성자 선언
	public Score(int kor, int math) {
		this.kor = kor;
		this.math = math;
	}
	//sum 접근자
	public int getSum() {
		return this.kor + this.math;
	}
	
	@Override
	public int compareTo(Score obj) {
		int r = this.getSum() - obj.getSum();
		if (r > 0)
			return 1;
		else if (r == 0 )
			return 0;
		else
			return -1;
	}
	//출력 메서드
	@Override
	public String toString() {
		return String.format("[Score - 국어:%d, 수학: %d, 총점: %3d]" , kor, math, getSum());	
	}	
}

public class TreeSetTest {
	public static void main(String[]args) {
		TreeSet<Integer> set =new TreeSet<Integer>();
		set.add(20);
		set.add(90);
		set.add(Integer.valueOf(75));
		set.add(Integer.valueOf(92));
		set.add(Integer.valueOf(50));
		
		System.out.println("Sorting(오름차순): " + set.toString());
		System.out.println("Sorting(내림차순): " + set.descendingSet());
		System.out.println();
		
		System.out.println("가장 낮은 점수: " + set.first());
		System.out.println("가장 높은 점수: " + set.last());
		
		//[요구사항 2] 여러 score 클래스를 저장
		
		TreeSet<Score> tSet = new TreeSet<Score>();
		tSet.add(new Score(21,22));
		tSet.add(new Score(71,78));
		tSet.add(new Score(11,12));
		tSet.add(new Score(31,32));

		System.out.println("\n반복자를 이용하여 출력 -  오름차순");
		Iterator<Score> it = tSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n반복자를 이용하여 출력 -  오름차순");
		Set<Score> sSet = tSet.descendingSet();
		Iterator<Score> sIt = sSet.iterator();
		while(sIt.hasNext()) {
			System.out.println(sIt.next());
		}
		System.out.println();
		
		
		
	}
}
