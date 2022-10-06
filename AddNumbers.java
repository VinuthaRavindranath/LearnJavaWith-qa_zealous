import java.util.Scanner;
/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("enter the first number");
            int num1 = scanner.nextInt();

            System.out.println("enter the second number");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum of two numbers is " + sum);

            System.out.println("To you want to repeat adding again? ");
            again = scanner.nextBoolean();

        } while (again);
        scanner.close();
    }
}
