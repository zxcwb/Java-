package 类和对象;

public class Person {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
class zxc{
    public static void main(String[] args) {
        Person p =  new Person();
        p.setName("周绪驰");
        System.out.println(p.getName());
    }
}