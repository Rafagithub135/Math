import java.awt.Point;

public class PreCalculusOne {
    public static void main(String[] args) {
        Point p1 = new Point (0, 0);
        Point p2 = new Point (3, 4);
        double d = distance(p1, p2);
        System.out.println(d);
    }

//    public static double

    public static double distancePoint(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double distance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
