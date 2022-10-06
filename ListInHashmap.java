import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListInHashmap {
    
    public static void main(String[] args) {
        HashMap<String, List<String>> authorsComic = new HashMap<String, List<String>>();
        authorsComic.put("Vinu", Arrays.asList("Book1", "Book2"));
        authorsComic.put("Pruthvi", Arrays.asList("Book3", "Book4"));

        HashMap<String, List<String>> authorsThriller = new HashMap<String, List<String>>();
        authorsThriller.put("Micky", Arrays.asList("Book4", "Book5"));
        authorsThriller.put("Minni", Arrays.asList("Book6", "Book7"));

    ArrayList<HashMap<String, List<String>>> allAuthours = new ArrayList<HashMap<String, List<String>>>();

    allAuthours.add(authorsComic);
    allAuthours.add(authorsThriller);

   for (HashMap<String,List<String>> hashMap : allAuthours) {
       System.out.println( allAuthours);
   }
    }
}
