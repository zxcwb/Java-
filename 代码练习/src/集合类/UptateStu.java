package 集合类;

import java.util.Iterator;
import java.util.TreeSet;

public class UptateStu implements Comparable<Object>{
    String name;
    long id;

    public UptateStu(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public UptateStu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UptateStu{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        UptateStu uptateStu = (UptateStu)o;
        int result = id>uptateStu.id?1:(id == uptateStu.id?0:-1);
        return result;
    }

    public static void main(String[] args) {
        UptateStu stu1 = new UptateStu("李雪松",1001);
        UptateStu stu2 = new UptateStu("周师傅",1002);
        UptateStu stu3 = new UptateStu("李答复",1003);
        UptateStu stu4 = new UptateStu("李积极",1004);
        TreeSet<UptateStu> treeSet = new TreeSet<>();
        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);
        Iterator<UptateStu> it = treeSet.iterator();
        System.out.println("Set集合中的所有元素：");
        while (it.hasNext()){
            UptateStu uptateStu = it.next();
            System.out.println(uptateStu);
        }
        it = treeSet.headSet(stu2).iterator();//截取排在stu2对象之前的对象
        System.out.println("截取前面部分的集合：");
        while (it.hasNext()){
            UptateStu stu = (UptateStu)it.next();
            System.out.println(stu.getId()+"，"+stu.getName());
        }
        it = treeSet.subSet(stu2,stu3).iterator();//截取排在stu2于stu3之间的集合（左闭右开）
        System.out.println("截取中间部分的集合");
        while (it.hasNext()){
            UptateStu stu = (UptateStu)it.next();
            System.out.println(stu.getId()+"，"+stu.getName());
        }
    }
}
