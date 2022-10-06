import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Vinu", 27);
        people.put("Pruthvi" , 19);

        for (String i : people.keySet()) {
            System.out.println(i + people.get(i));
        }
    }

}
