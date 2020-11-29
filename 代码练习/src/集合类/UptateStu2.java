package 集合类;

import java.util.*;

public class UptateStu2 {
    public static void main(String[] args) {
        Map<String,String> map  = new HashMap<>();
        map.put("周绪驰","1903140222");
        map.put("小街基","1903140234");
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("key集合中的元素：");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Collection<String> collection = map.values();
        it = collection.iterator();
        System.out.println("values集合中的元素");
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
