package 集合类;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        Iterator<String> it = collection.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
