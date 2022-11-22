package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Lesson2 {
    public static void main(String[] args) {
        HashMap<Integer, String> tm = new HashMap<>(
                Map.of(100, "Micky", 101, "Minni", 102, "Donald", 103, "Goffy", 104, "Harry", 105, "Ron"));

        tm.put(106, "Albus");
        tm.put(107, "Snape");
        tm.put(108, "Hagrid");

        System.out.println("Updated list of elements:");
        tm.replace(102, "Gaurav");

        for (Map.Entry m : tm.entrySet()) {
            System.out.print(m.getKey() + " " + m.getValue() + ",");
        }

    }
}
