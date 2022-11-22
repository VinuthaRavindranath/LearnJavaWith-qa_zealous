package Collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lesson1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(0, "Micky");
        lhm.put(1, "Minni");
        lhm.put(2, "Donald");
        lhm.put(3, "Goffy");

        for (Map.Entry m : lhm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
