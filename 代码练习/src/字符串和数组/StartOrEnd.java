package 字符串和数组;

public class StartOrEnd {
    public static void main(String[] args) {
         String num1 = "22045612";
         String num2 = "21304578";
         boolean b = num1.startsWith("22");
         boolean b2 = num1.endsWith("78");
         boolean b3 = num2.startsWith("22");
         boolean b4 = num2.endsWith("78");
        System.out.println("b="+b+",b2="+b2+",b3="+b3+",b4="+b4);
    }
}
