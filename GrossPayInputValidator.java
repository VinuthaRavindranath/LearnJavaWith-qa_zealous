import java.util.Scanner;

public class GrossPayInputValidator {
    /*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
    public static void main(String[] args) {
      
        //Initialize known variables
        int rate = 15;
        int maxHours = 40;

        System.out.println("Enter the number of working hours of the employee");
        Scanner scanner = new Scanner(System.in);
        int hours =scanner.nextInt();
        
        while (hours > maxHours || hours < 1) {
            System.out.println("invalid working hours");
            hours = scanner.nextInt();
            scanner.close();
        }

       int grosspay = rate * hours;
       System.out.println("gross pay of the employee is "+ grosspay);
    }
}
