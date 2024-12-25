import java.awt.*;
import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        rectangle();
        findCenter(new Rectangle(0, 0, 50, 100));
        areaTriangle();
    }

    public static double rectangle() {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        double width = box.getWidth();
        double height = box.getHeight();
        double area = width * height;
        System.out.println(box);
        System.out.println("The area of the rectangle is " + area + ".");
        System.out.println("The width of the rectangle is " + width + ".");
        System.out.println("The height of the rectangle is " + height + ".");
        System.out.println();
        return area;
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        Point Point = new Point(x, y);
        System.out.println(Point);
        return new Point(x, y);
    }
    
    public static double getAreaFourSide(double width, double height) {
        return width * height;
    }

    public static double areaTriangle() {
        Scanner triangle = new Scanner(System.in);
        System.out.println("Please enter the base of the triangle:  ");
        double base = triangle.nextDouble();
        System.out.println("PLease enter the height of the triangle:  ");
        double height = triangle.nextDouble();
        return (base * height) / 2;
    }
    
}