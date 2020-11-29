package 字符串和数组;

public class Opinion {
    public static void main(String[] args) {
        //使用 == 比较的是内存地址，我们知道即使是内容相同，内存地址也是不一样的
        String s1 = new String("abc");
        String s2 = new String("ABC");
        String s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);//都是false
        boolean b = s1.equals(s2);
        System.out.println(b);//false
        b = s1.equals(s3);
        System.out.println(b);//true
        b = s1.equalsIgnoreCase(s2);
        System.out.println(b);//true
    }
}
