package exam_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Member 클래스를 생성한다. 필드는 이름(name)과 나이(age)를 가지고 있다.
 * [요구사항]
 * 1. 나이가 같으면 동일 객체로 본다.
 * 2. 1 요구사항 확인 후 다시 이름이 같으면 동일 객체로 본다
 * 3. 2 요구사항 확인 후 이름과 나이가 같으면 동일 객체로 본다 */

public class HashSetExample03 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("홍길동", 50));
        set.add(new Member("홍길동", 50));
        set.add(new Member("김희진", 36));
        set.add(new Member("이철진", 50));
        set.add(new Member("홍길동", 36));


        System.out.println("총 객체수 : " + set.size());
      // System.out.println("\t" + set.toString());
        
       Iterator<Member> iter = set.iterator(); //반복자
       while(iter.hasNext()) {
    	   System.out.println("\t" + iter.next());
    	   //Member m - iter.next();
       }
    }
}