package Collections.HashSet;

//HashSet
import java.util.HashSet;
import java.util.Iterator;

public class Lesson1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);

        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
