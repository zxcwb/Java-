package 字符串和数组;

public class Wordbook {
    public static void main(String[] args) {
        String string = new String("b");
        String string2 = new String("a");
        String string3 = new String("c");
        String string4 = new String("a");
        System.out.println(string2.compareTo(string4));
        System.out.println(string.compareTo(string2));
        System.out.println(string.compareTo(string3));
        //如果此对象位于参数对象前面返回-1，后面返回1，相等返回0

    }
}
