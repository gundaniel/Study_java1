package exam_collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

class Fruit implements Comparable<Fruit>{
	//필드
	private String name;
	private int price;

	//생성자 선언
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int compareTo(Fruit o) {
		/*
		if(price < o.price) return -1;
		else if(price == o.price) return 0;
		else return 1;
		*/
		return (this.price < o.price) ? -1: ((this.price == o.price)? 0 :1); //삼항연산자 이용

	}
	//출력메서드
	@Override
	public String toString() {
		return name;
	}
	//접근자 설정자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
	//------------------------------------------------------------	
public class SortTest {
	public static void main(String[]args) {
		
		Fruit array[] = {
				new Fruit("포도",3000),
				new Fruit("수박",20000),
				new Fruit("딸기",11900)
		};
		Arrays.sort(array);
		System.out.println("배열값 : " + Arrays.toString(array));
		System.out.println();
	//------------------------------------------------------------	
	
		//값을 리스트 타입으로 변환하여 컬랙션 클래스의 정렬메서드를 사용하여 정렬
		List<Fruit> list = Arrays.asList(array);
		
		//오름차순 정렬코드 추가
		Collections.sort(list);
		System.out.println("오름차순: ");
		for(Fruit fruit : list) {
			System.out.println("과일명: " + fruit.getName() 
			+ ", 가격: " + fruit.getPrice());
		}
		System.out.println();
	//------------------------------------------------------------	
		//내림차순 정렬코드 추가
		Collections.reverse(list);
		System.out.println("내림차순: " + list.toString());
		System.out.println();
	//------------------------------------------------------------		
		//TreeSet에 저장하여 출력(가격순으로 정렬)
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 20000));
		treeSet.add(new Fruit("딸기", 11900));
		treeSet.add(new Fruit("딸기", 11900));
		System.out.println("결과값 : " + treeSet.toString());
		
		
	 	
		
		
		
	}
	
}
