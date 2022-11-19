package Collections.ArrayList;
//traverse ArrayList elements using the Iterator interface.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(10, 15, 20, 25, 30, 35, 40, 45, 30));

        al.add(5);
        al.add(50);
        al.addAll(1, al2);
        al.set(3, 111);

        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
