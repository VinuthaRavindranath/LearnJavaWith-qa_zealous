package Collections.ComparableInterface;

import java.util.TreeSet;

class Point implements Comparable {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + "y=" + y;
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;
        if (this.x < p.x) {
            return -1;
        }

        else if (this.x > p.x) {
            return 1;
        }

        else {
            if (this.y < p.y) {
                return -1;
            } else if (this.y > p.y) {
                return 1;
            } else {
                return 0;
            }

        }
    }

}

public class Lesson1 {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();
        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 5);
        Point p3 = new Point(5, 2);
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);

        System.out.println(ts);
    }
}
