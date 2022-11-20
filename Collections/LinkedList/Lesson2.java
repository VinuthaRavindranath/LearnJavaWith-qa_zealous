package Collections.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lesson2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(95, 60, 7, 18, 90));

        ll1.add(109);
        ll1.add(99);
        ll1.add(02);
        ll1.add(88);
        ll1.addAll(ll2);
        ll1.addFirst(01);
        ll1.addLast(101);

        Collections.sort(ll1);

        ListIterator<Integer> ls = ll1.listIterator();
        while (ls.hasNext()) {
            System.out.print(ls.next() + " ");
        }
    }
}
