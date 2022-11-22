package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Lesson1 {
    public static void main(String[] args) {
        HashMap<Integer, String> tm = new HashMap<>();
        tm.put(0, "Micky");
        tm.put(1, "Minni");
        tm.put(2, "Donald");
        tm.put(3, "Goffy");

        for (Map.Entry m : tm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
