package 题目练习.第三章Java语言基础;

import java.math.BigDecimal;

public class First {
    int age;
    String name;
    public static void main(String[] args) {
        String address = "湖北省天门市彭市镇同乐村六组38号";
        String telephone = "15271212657";
        First first = new First();
        System.out.println(first.age+","+first.name);  //创建对象赋予初始值
        first.age = 18;
        first.name = "周绪驰";
        System.out.println(first);
        System.out.println(address+","+telephone);


        short num = 159;
        System.out.println((int)num);
    }


}
