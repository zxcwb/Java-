package 类和对象;

public class StaticTest {
    final static double PI = 3.1415;
    static int id;

    public static void method1(){
        System.out.println("method1方法执行了");
    }

    public static String method3(){
        return "method3方法执行了";
    }

    public void method2(){
        System.out.println(StaticTest.PI);
        System.out.println(StaticTest.id);
        StaticTest.method1();
        StaticTest.method3();
    }

    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        staticTest.method2();
    }
}
