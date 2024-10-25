package exam_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample02 {
    public static void main(String[] args) {
        // 인터페이스<타입인자> 참조변수 = new 구현클래스 생성자<>();
        Set<Key> set = new HashSet<Key>();

        set.add(new Key(1));
        set.add(new Key(13));
        set.add(new Key(1));
        set.add(new Key(35));
        set.add(new Key(3));

        int size = set.size();
        System.out.println("총 객체수: " + size);

        Iterator<Key> iterator = set.iterator();
        while(iterator.hasNext()) {
            Key k = iterator.next();
            System.out.println("\t" + k.toString());
        }
    }
}