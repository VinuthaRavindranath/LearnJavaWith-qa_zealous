import java.util.Scanner;

public class LogicalOperatorsLoanQualifier {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;
        System.out.println("Enter the salary of the loan applier");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the years with the current employeer ");
        double years = scanner.nextDouble();
        scanner.close();

        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats you qulaify for the loan");
        }

        else {
            System.out.println("Sorry you must have worked at your current job atleast for 2 years");
            System.out.println("Sorry you must earn atleast" + requiredSalary);
        }

    }
}
