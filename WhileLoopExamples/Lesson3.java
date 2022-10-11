package WhileLoopExamples;
import java.util.Scanner;
//Sum of Positive Numbers Only
public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int i =sc.nextInt();
        while (i<=10) {
           i = i + 1;
           System.out.println(i);
        }
        System.out.println("Entered a number is greater than 10");
        sc.close();
    }
}
