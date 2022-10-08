package IfConditionExamples;
//Java code example for nested if-else.
import java.util.Scanner;
public class Lesson9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        System.out.println("Enter the weight: ");
        int weight=sc.nextInt();
        if(age>=18)
        {      
           if(weight>50)
           {    
              System.out.println("The person is eligible to donate blood");    
           }
           else
           {  
              System.out.println("The person is not eligible to donate blood");    
           }  
        }
        else
        {  
            System.out.println("Age must be greater than 18");  
        } 
        sc.close(); 
     } 
}
