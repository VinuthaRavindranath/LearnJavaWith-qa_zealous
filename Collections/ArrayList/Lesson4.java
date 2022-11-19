package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//sorting of Integer and String using Collections.sort()
public class Lesson4 {
    public static void main(String[] args) {

        ArrayList<Integer> an = new ArrayList<>(List.of(88, 10, 05, -1, 99, 98, 0, 11, 56, 89));
        Collections.sort(an);

        Iterator<Integer> it = an.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        ArrayList<String> as = new ArrayList<>(
                List.of("zebra", "elephant", "tiger", "monkey", "cat", "dog", "snake", "lion"));

        Collections.sort(as);

        Iterator<String> its = as.iterator();
        while (its.hasNext()) {
            System.out.print(its.next() + " ");
        }
    }
}
