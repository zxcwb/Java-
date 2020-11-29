package 集合类.练习;

import java.util.*;

public class first {

    public static void main(String[] args) {
       /* //将1-100之间的正整数存放在一个list集合，并将索引位置为10的对象从集合中移除
        List list = new ArrayList();
        for (int i = 2;i < 100;i++){
            list.add(i);
        }
        int list10 = (int)list.remove(10);
        System.out.println(list10);*/

       /*
       向Set或List集合中添加'A','a','c','C','a'5个元素，观察重复值能否重复地在List以及Set集合中添加

       Set set = new HashSet();
        List list = new ArrayList();

        set.add('A');
        set.add('a');
        set.add('c');
        set.add('C');
        set.add('a');

        list.add('A');
        list.add('a');
        list.add('c');
        list.add('C');
        list.add('a');

        Iterator iterator = set.iterator();
        Iterator iterator1 = list.iterator();
        System.out.println("set集合中所有元素:");
        while (iterator.hasNext()){
            char char1 = (char)iterator.next();
            System.out.println(char1);
        }
        System.out.println("list集合中所有元素:");
        while (iterator1.hasNext()){
            char char2 = (char)iterator1.next();
            System.out.println(char2);
        }
        //得出结论set集合不可重复，list集合可重复
        */

       /*
       创建map集合，创建Emp对象，并将对象添加到集合中，Emp对象的id作为Map集合的键，并将id为015的对象从集合中移除。
        */
       Map map = new HashMap();
       Emp emp1 = new Emp(01,"周绪驰");
       Emp emp2 = new Emp(02,"陈晨萌");
       Emp emp3 = new Emp(03,"高康凯");
       Emp emp4 = new Emp(04,"朱军坤");
       Emp emp5 = new Emp(015,"孙策");

       map.put(emp1.getId(),emp1.getName());
       map.put(emp2.getId(),emp2.getName());
       map.put(emp3.getId(),emp3.getName());
       map.put(emp4.getId(),emp4.getName());
       map.put(emp5.getId(),emp5.getName());

       map.remove(015);
       map.remove(03);
       map.remove(04);
       Iterator<Integer> integerIterator= map.keySet().iterator();
      while (integerIterator.hasNext()){
          Integer integer = integerIterator.next();
          String name = (String)map.get(integer);
          System.out.println(name);
      }
    }
}
