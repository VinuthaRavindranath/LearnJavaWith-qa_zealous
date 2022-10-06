import java.util.Scanner;

public class OddOrEven {
   public static void main(String[] args) {
       System.out.println("Enter the number");
       Scanner scanner = new Scanner(System.in);
       int num =scanner.nextInt();

       if (num % 2 == 0) {
           System.out.println("the number is even: "+ num);
       } else {
        System.out.println("the number is odd: "+ num);
       }
       scanner.close();
   } 
}
