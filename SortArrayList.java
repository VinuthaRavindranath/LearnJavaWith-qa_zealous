import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(90);
        numbers.add(60);
        numbers.add(45);

        Collections.sort(numbers);

        for (Integer i : numbers) {
            System.out.println(i);

        }
        List <String> names = new ArrayList<String>();
    }


}
