import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;
        System.out.println("Enter the salary of the loan applier");
        Scanner scanner = new Scanner(System.in);
        double salary =scanner.nextDouble();

        System.out.println("Enter the years with the current employeer ");
        double years = scanner.nextDouble();
        scanner.close();

        if (salary >= requiredSalary ) { 
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats you qulaify for the loan");
            }
            else{
               System.out.println("Sorry you must have worked at your current job atleast for 2 years"); 
            }
        }
        else{ 
            System.out.println("Sorry you must earn atleast"+ requiredSalary);
        }
    
    }
}
