package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>(
                List.of("zebra", "elephant", "tiger", "monkey", "cat", "dog", "snake", "lion"));

        als.add("lepord");
        als.add("rabbit");

        // using for loop to traverse
        for (int i = 0; i < als.size(); i++) {
            System.out.print(als.get(i) + " ");
        }
        System.out.println();

        // using foreach to traverse
        for (String animals : als) {
            System.out.print(animals + " ");
        }
        System.out.println();

        // using Iterator to traverse
        Iterator<String> it = als.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
