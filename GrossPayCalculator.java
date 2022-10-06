import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int workingHours =scanner.nextInt();

        System.out.println("Enter the employee pay rate");
        double payRate = scanner.nextDouble();
        scanner.close();

        double grossPay = workingHours * payRate;
        System.out.println("The employee's gross pay is " + grossPay);
    }
}
