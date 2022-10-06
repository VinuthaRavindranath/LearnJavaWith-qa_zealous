import java.util.Scanner;

public class isPalindrome {
    
    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner scanner = new Scanner(System.in);
        String word =scanner.next();
        char ch;
        String newWord ="";
        boolean ans = false;

        for (int i = 0; i < word.length(); i++) {
            ch= word.charAt(i);
            newWord= ch+newWord;
        }

        if (word.equals(newWord)) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
}
