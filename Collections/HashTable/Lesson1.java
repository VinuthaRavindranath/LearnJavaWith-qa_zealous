package Collections.HashTable;

//Legacy class, we can use hashmap or hashset instead
import java.util.Enumeration;
import java.util.Hashtable;

public class Lesson1 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(0, "Micky");
        ht.put(1, "Minni");
        ht.put(2, "Donald");
        ht.put(3, "Goffy");

        Enumeration e = ht.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
