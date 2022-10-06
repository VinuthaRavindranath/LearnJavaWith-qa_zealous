import java.util.Scanner;

/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/
public class salaryCalculator {
    int salary = 1000;
    int salaryWithBonus;

    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int maxSalesMade = 10;

        System.out.println("How may sales did the employee make? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > maxSalesMade) {
            int grossSalary = salary + bonus;
            System.out.println("Gross Salary of the employee with bonus is: " + grossSalary);
        } else {
            int grossSalary = salary;
            System.out.println("Gross Salary of the employee without bonus is: " + grossSalary);
        }
    }
}
