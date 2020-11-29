package 字符串和数组.字符串;

public class NewStr {
    public static void main(String[] args) {
        String string = "address";
        System.out.println(string);  //如果字符串中有多个重复的字符串，那么使用replace会将其全部替换
        String newstr = string.replace("a","A");
        System.out.println(newstr);
    }
}
