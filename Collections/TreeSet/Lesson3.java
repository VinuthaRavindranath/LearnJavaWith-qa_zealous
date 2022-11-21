package Collections.TreeSet;

//Find min and max using TreeSet pollFirst() and pollLast()
import java.util.TreeSet;

public class Lesson3 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(50);
        ts.add(90);
        ts.add(01);
        ts.add(5);
        ts.add(99);
        ts.add(88);

        System.out.println("Minimum number : " + ts.pollFirst());
        System.out.println("Maximum number : " + ts.pollLast());
        System.out.println("Second maximum number : " + ts.pollLast());

    }
}
