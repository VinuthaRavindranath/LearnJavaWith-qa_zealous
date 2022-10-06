import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println("Enter the words");
        Scanner scanner = new Scanner(System.in);
        String words =scanner.nextLine();

        String reversedWords[] = words.split(" ");
        String newWords = " ";
        char ch;
        String newWords2 = " ";

        for (int i = reversedWords.length-1; i >=0; i--) {
            newWords = newWords +reversedWords[i] + ' ';     
        }
        //System.out.println(newWords);

        for (int i = 0; i < newWords.length(); i++) {
            ch = newWords.charAt(i);
            newWords2 = ch+newWords2;
        }
        System.out.println(newWords2);
    }
}
