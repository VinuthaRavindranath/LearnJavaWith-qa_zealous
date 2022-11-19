package Collections.ArrayList;

//traverse ArrayList elements using the ListIterator interface.
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lesson5 {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>(
                List.of("zebra", "elephant", "tiger", "monkey", "cat", "dog", "snake", "lion"));

        als.add("lepord");
        als.add("rabbit");

        ListIterator<String> ls = als.listIterator();
        while (ls.hasNext()) {
            System.out.print(ls.next() + " ");
        }

    }
}
