import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Enter the First string");
        Scanner scanner = new Scanner(System.in);
        String text1 =scanner.next();

        System.out.println("Enter the second string");
        String text2 =scanner.next();

        char arr1[]= text1.toCharArray();
        char arr2[]= text2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedString1 = new String(arr1);
        String sortedString2 = new String(arr2);

        if (sortedString1.equals(sortedString2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }

    }
}
