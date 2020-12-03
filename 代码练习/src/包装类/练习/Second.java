package 包装类.练习;

public class Second {
    public static void main(String[] args) {
        Character character1 = new Character('A');
        Character character2 = new Character('B');
        boolean b = character1.equals(character2);
        System.out.println(b);//false
        Character c = Character.toLowerCase(character1);
        Character c1 = Character.toLowerCase(character2);
        System.out.println(c.equals(c1));
    }
}
