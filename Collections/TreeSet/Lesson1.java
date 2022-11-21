package Collections.TreeSet;

//TreeSet (this is a sorted set and by default it is ascending in order)
import java.util.Iterator;
import java.util.TreeSet;

public class Lesson1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(50);
        ts.add(90);
        ts.add(01);
        ts.add(5);
        ts.add(99);
        ts.add(88);

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
