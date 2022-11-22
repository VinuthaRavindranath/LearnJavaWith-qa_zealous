package Collections.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Lesson2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(
                Map.of(100, "Micky", 101, "Minni", 102, "Donald", 103, "Goffy", 104, "Harry", 105, "Ron"));

        tm.put(106, "Albus");
        tm.put(107, "Snape");
        tm.put(108, "Hagrid");

        // Maintains descending order
        System.out.println(tm.descendingMap());
        System.out.println("headMap: " + tm.headMap(102, true));
        // Returns key-value pairs whose keys are greater than or equal to the specified
        // key.
        System.out.println("tailMap: " + tm.tailMap(102, true));
        // Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: " + tm.subMap(100, false, 102, true));

        for (Map.Entry m : tm.entrySet()) {
            System.out.print(m.getKey() + " " + m.getValue() + ",");
        }

    }
}
