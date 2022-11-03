package ExceptionHandling;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter a and b values");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0, try again" + e);
        }
        System.out.println("Bye, end of the program");
        sc.close();
    }
}
