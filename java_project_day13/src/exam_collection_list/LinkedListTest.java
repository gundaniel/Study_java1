package exam_collection_list;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListTest {
	public static void main(String[]args) {
		LinkedList<String> list =new LinkedList<String>();
		list.add("가디언즈 오브 갤럭시");
		list.add("베놈 라스트 댄스");
		
		System.out.println(list.toString());
		System.out.println();
		
		Iterator<String> it = list.iterator();	 //Iterator 는 모든 원소에 순차적으로 접근하는 것이다
		while(it.hasNext()) {
			System.out.println(it.next());			
		}
		
	}
	
}
