package IfConditionExamples;
import java.util.Scanner;
//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.
public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Employee Salary is :");
        Scanner sc = new Scanner(System.in);
        int employeeSalary =sc.nextInt();
        System.out.println("Employee Service is :");
        int employeeService= sc.nextInt();

        if (employeeService>5) {
            int calculatedBonus = (employeeSalary/100)*5;
            int bonusSalary = employeeSalary + calculatedBonus;
            System.out.println("Salary with bonus is :"+ bonusSalary);
        } else {
            System.out.println("Salary without bonus is :"+ employeeSalary);
        }
        sc.close();
    }
}
