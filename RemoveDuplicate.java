
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner scanner = new Scanner(System.in);
        String word =scanner.next();

        char arr[] = word.toCharArray();

       Arrays.sort(arr);
       String newWord = new String();

      for (int i = 1; i < arr.length; i++) {
          if (arr[i]!= arr[i-1]) {
            newWord += arr[i];
          }
      }

      if (arr[0]!= arr[1]) {
        newWord = arr[0]+newWord;
      }

      System.out.println(newWord);
    }
}
