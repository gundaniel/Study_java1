package exam_class;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class RandomList {
	public static void main(String[]args){
	
		Random ran = new Random(); //랜덤 인스턴스 생성
		List<Integer> list = new ArrayList<Integer>(); //
		//list.add(ran.nextInt(100)+1);
	
		for(int i = 0; i < 10; i++) { //1부터 100까지의 값중에 10개 를 저장
			list.add(ran.nextInt(100)+1);
		}

		System.out.println("정렬 전 list 데이터");
		for(int j = 0; j <= 9; j++) {
			System.out.print(list.get(j)+ " ");
		}
		System.out.println();
		
		Collections.sort(list); //정렬에 사용하는 메서드
			System.out.println("정렬 후 list 데이터");
		for(Integer i : list) { //향상된 for 문
			System.out.print(i + " ");
		}
		
	}
}
