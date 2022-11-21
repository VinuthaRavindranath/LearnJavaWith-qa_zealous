package Collections.TreeSet;

//TreeSetexample of traversing elements in descending order as well.
import java.util.Iterator;
import java.util.TreeSet;

public class Lesson2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Micky");
        ts.add("Mini");
        ts.add("Donald");
        ts.add("Goffy");
        ts.add("Harry");

        Iterator<String> it = ts.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        Iterator<String> itr = ts.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}
