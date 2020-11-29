package 集合类;

import java.util.*;

public class Map接口实现类 {
    private String e_id;
    private String e_name;

    public Map接口实现类(String e_id, String e_name) {
        this.e_id = e_id;
        this.e_name = e_name;
    }

    public Map接口实现类() {
    }

    public String getE_id() {
        return e_id;
    }

    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }
}
class MapText{
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        Map接口实现类 map接口实现类 = new Map接口实现类("b123","张三");
        Map接口实现类 map接口实现类2 = new Map接口实现类("d456","李四");
        Map接口实现类 map接口实现类3 = new Map接口实现类("c789","王五");
        Map接口实现类 map接口实现类4 = new Map接口实现类("a101","关羽");

        map.put(map接口实现类.getE_id(),map接口实现类.getE_name());
        map.put(map接口实现类2.getE_id(),map接口实现类2.getE_name());
        map.put(map接口实现类3.getE_id(),map接口实现类3.getE_name());
        map.put(map接口实现类4.getE_id(),map接口实现类4.getE_name());

        Set<String> set = map.keySet(); //获取map集合中的key对象集合

        Iterator<String> iterator = set.iterator();
        System.out.println("HashMap类实现的Map集合，无序：");
        while (iterator.hasNext()){
            String string = (String)iterator.next();
            String name = (String)map.get(string);
            System.out.println(string+""+name);
        }
        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        Iterator<String> iterator1 = treeMap.keySet().iterator();
        System.out.println("TreeMap类实现的Map集合，键对象升序：");
        while (iterator1.hasNext()){
            String string = (String)iterator1.next();
            String name = (String)treeMap.get(string);
            System.out.println(string+""+name);
        }

    }
}