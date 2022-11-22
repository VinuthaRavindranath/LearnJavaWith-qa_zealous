package Collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lesson2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, .75f, true);

        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(9, "E");
        lhm.put(8, "F");
        String s = lhm.get(2);
        s = lhm.get(5);
        s = lhm.get(1);

        for (Map.Entry m : lhm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
