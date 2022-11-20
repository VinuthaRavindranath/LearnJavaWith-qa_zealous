package Collections.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lesson1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        ll1.add(11);
        ll1.add(22);
        ll1.add(33);
        ll1.add(44);
        ll1.addAll(ll2);
        ll1.addFirst(01);
        ll1.addLast(101);

        ListIterator<Integer> li = ll1.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
    }
}
