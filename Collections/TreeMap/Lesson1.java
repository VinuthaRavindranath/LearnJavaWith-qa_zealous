package Collections.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Lesson1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(0, "Micky");
        tm.put(1, "Minni");
        tm.put(2, "Donald");
        tm.put(3, "Goffy");

        for (Map.Entry m : tm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
