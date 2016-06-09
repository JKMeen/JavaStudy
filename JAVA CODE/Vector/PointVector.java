import java.util.Iterator;
import java.util.Vector;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x; this.y = y;
    }

    public String toString() {
        return "("+x+","+y+")";
    }
}

public class PointVector {

    public static void main(String[] arg) {

        Vector<Point> v = new Vector<Point>();

        v.add(new Point(1,2));
        v.add(new Point(2,2));
        v.add(new Point(3,2));
        v.add(new Point(4,2));

        v.insertElementAt(new Point(0,0), 2);

        Iterator<Point> it = v.iterator();
		while(it.hasNext()){
			Point n = it.next();
			System.out.println(n);
		}
    }
}
