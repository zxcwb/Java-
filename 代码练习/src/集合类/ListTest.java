package 集合类;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int)(Math.random()*list.size());//Math的random是获取0.0--1.0的随机数
        System.out.println("随机获取数组中的元素："+list.get(i));
        list.remove(2);
        for (int j = 0;j < list.size();j++){
            System.out.print("移除后的数组中的元素："+list.get(j));
        }
    }
}
