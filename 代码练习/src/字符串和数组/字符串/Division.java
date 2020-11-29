package 字符串和数组.字符串;

public class Division {
    public static void main(String[] args) {
        String s = "192.168.0.1";
        String[] firstArray = s.split("\\.");
        String[] secondArray = s.split("\\.",2);
        System.out.println("str的原值为:["+s+"]");
        //输出全部分割的结果
        System.out.println("全部分割的结果：");
        for (String a:firstArray){
            System.out.print("["+a+"]");
        }
        System.out.println();
        //输出两次分割结果
        System.out.println("分割两次的结果:");
        for (String a : secondArray){
            System.out.println("["+a+"]");
        }
        System.out.println();
    }
}
