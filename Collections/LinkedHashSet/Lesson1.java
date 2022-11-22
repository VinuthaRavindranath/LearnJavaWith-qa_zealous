package Collections.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Lesson1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(10);

        Iterator<Integer> it = lhs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
