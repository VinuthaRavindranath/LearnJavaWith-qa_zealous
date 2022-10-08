package IfConditionExamples;
import java.util.Scanner;
//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount using Teranary operator
public class Lesson6 {
    public static void main(String[] args) {
        System.out.println("Employee Salary is :");
        Scanner sc = new Scanner(System.in);
        int employeeSalary =sc.nextInt();
        System.out.println("Employee Service is :");
        int employeeService= sc.nextInt();
        int salary= (employeeService>5)? employeeSalary+((employeeSalary/100)*5):employeeSalary;
        System.out.println("Salary without bonus is :"+ salary);
        sc.close();
    }   
}
