package Collections.ArrayList;

//ArrayList basic program
import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(10, 15, 20, 25, 30, 35, 40, 45, 30));

        al.add(5);
        al.add(50);
        al.addAll(1, al2);
        al.set(3, 111);

        System.err.println(al);
        System.out.println(al.contains(50));
        System.out.println(al.get(5));
        System.out.println(al.indexOf(25));
        System.out.println(al.lastIndexOf(30));

        // we can use for loop to display /interate through the arraylist
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        // we can also use foreach to display /interate through the arraylist
        for (Integer arr : al) {
            System.out.print(arr + " ");
        }
    }
}
