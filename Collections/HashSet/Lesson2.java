package Collections.HashSet;

//Java HashSet from another Collection
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Lesson2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Micky");
        al.add("Mini");
        al.add("Donald");
        al.add("Goffy");
        al.add("tweety");

        HashSet<String> hs = new HashSet<>(al);
        hs.add("Harry");
        hs.add("Ron");
        hs.add("Renny");
        hs.add("Hermione");

        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
