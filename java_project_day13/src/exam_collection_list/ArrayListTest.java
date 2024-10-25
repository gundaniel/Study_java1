package exam_collection_list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[]args) {
		
		//문자열을 저장하도록 인스턴스 생성
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Java");
		list.add("JSP");
		list.add("Spring");
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		list.add(1, "ORACLE");
		list.add(2, "Client programming"); //Java Oracle
		list.remove(3);
		String data = list.remove(3);
		System.out.println("삭제된 원소: " + data);
	
		
		int index = list.indexOf("Java");
		System.out.println(index);
		
		index = list.indexOf("Java");
		System.out.println(index);
		
		for(int i = 0; i < list.size(); i++) { 
			System.out.println(list.get(i));
		}	
		System.out.println();
	//------------------------------------------------------------	
		/* for ~ each문으로 출력 (향상된 for문)
		* 형식: for(데이터 타입 변수명: 배열명이나 컬렉션의 참조변수명)
		* 
		* for(String s: list)
		* system.out.println(s);
		*/	
		
		System.out.println("list가 가진 모든 원소를 문자열로 반환");
		System.out.println(list.toString());
		System.out.println();
	
		//정수값 저장 인스턴스 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(23);
		list1.add(94);
		list1.add(Integer.valueOf(62));
		list1.add(Integer.valueOf(45));
		System.out.println();
		
		list1.add(2,Integer.valueOf(78)); //2번째에 저장하라
		System.out.println(list1.toString());
		System.out.println();
	//------------------------------------------------------------	
		
		// Apple 이라는 이름으로 클래스를 생성한다. 이 클래스는 품종(kind)과 색상(color)을 필드로 가진다.
        // 여러 사과(Apple)를 저장하도록 인스턴스 생성.
        ArrayList<Apple> list2 = new ArrayList<Apple>();
        list2.add(new Apple("부사", "빨강"));
        list2.add(new Apple("아오리", "초록"));
        list2.add(new Apple("썸머킹", "황금"));
        list2.add(new Apple("홍로", "빨간"));

        // 출력 - 1 //직접접근
        for(int i=0; i < list2.size(); i++) {
            System.out.print("품종: " + list2.get(i).getKind()); // n번째에 값을 가진 n을 출력할 수 있음
            System.out.println(", 색상: " + list2.get(i).getColor());
            //System.out.println(list2.get(i).toString());
        }
        System.out.println();

        // 출력 - 2 //새로운 변수 선언으로 변수로 접근
        for(int i=0; i < list2.size(); i++) { 
            Apple app = list2.get(i);
            System.out.print("품종: " + app.getKind());
            System.out.println(", 색상: " + app.getColor());
            //System.out.println(app.toString());
        }
        System.out.println();

        // 출력 - 3 : for ~ each 문으로 출력.
        for(Apple app : list2) {
            System.out.println(app.toString());
        }
        System.out.println();
        
        System.out.println("list2가 가진 모든 원소를 문자열로 반환");
        System.out.println(list2.toString());
        System.out.println();
       
    //------------------------------------------------------------	

        // 여러 영화(Movie) 정보를  저장하도록 인스턴스 생성
        // Movie 클래스는 영화제목(mTitle), 평점(mGrade), 감독(mDirector), 개봉일(anYear) 등의 필드를 가진다.
        //인터페이스명<타입 인자> 참조변수 = new 구현클래스 생성자<타입 인자>();
        
        List<Movie> list3 = new ArrayList<Movie>();
        list3.add(new Movie("스파이더맨1", 9.9, "토비맥과이어", "2002"));
        list3.add(new Movie("아이언맨1", 9.9, "로버트 다우니주니어", "2008"));
        list3.add(new Movie("토르1", 9.9, "크리스 햄스워드", "2011"));
        
       for (Movie mov : list3) { //향상된 for문 (인스턴스생성 없이 변수 바로 선언가능)
    	   System.out.println(mov.toString());
       }
    }
}


			
		
			
			
			
			
		
		
		
		
	

