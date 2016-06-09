import java.util.*;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x; this.y = y;
    }

    public String toString() {
        return "("+x+","+y+")";
    }

    public int getX() { return x; }
    public int getY() { return y; }
}

public class PointVector2 {

    public static void main(String[] arg) {

        Vector<Point> v = new Vector<Point>();

        v.add(new Point(1,2));
        v.add(new Point(2,2));
        v.add(new Point(3,2));
        v.add(new Point(4,2));

        v.insertElementAt(new Point(0,0), 2);

        Iterator<Point> it = v.iterator();
        double X = 0.0; double Y = 0.0;
        int n=0;
        while(it.hasNext()) {
            Point p = it.next();
            X += p.getX();
            Y += p.getY();
            n++;
        }
        X /= n; Y /= n;
        System.out.println("Center of Mass = (" + X + "," + Y + ")");

    }
}