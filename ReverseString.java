import java.util.Scanner;

public class ReverseString {
   public static void main(String[] args) {
       System.out.println("enter the string to be reversed");
       Scanner scanner = new Scanner(System.in);
       String words =scanner.next();
       scanner.close();
       String neword= "";
       char ch;

       for (int i = 0; i < words.length(); i++) {
           ch = words.charAt(i); //extracts each character
           neword = ch+neword; //adds each character in front of the existing string
       }
       System.out.println("reversed word:" + neword);
   } 
}
