import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        int total = num1+num2;
        System.out.println("Sum of two numbers :"+ total);
    }
}
