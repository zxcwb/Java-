package 类和对象;

public class RectangleArea {
    private double length;
    private double wide;

    public RectangleArea(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    public static double area(RectangleArea rectangleArea){
        return rectangleArea.length*rectangleArea.wide;
    }

    public static void main(String[] args) {
        RectangleArea rectangleArea = new RectangleArea(12.7,12);
        System.out.println(RectangleArea.area(rectangleArea));
    }
}
