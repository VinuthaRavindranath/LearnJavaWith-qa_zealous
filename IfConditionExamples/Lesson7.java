package IfConditionExamples;
import java.util.Scanner;
// Java program to illustrate if-else-if ladder
public class Lesson7 {
    public static void main(String[] args) {
        System.out.println("Enter a three numbers");
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();

        if (num1 > num2 && num1> num3) {
            System.out.println("num is: "+  num1);
        }
        else if (num2> num3 ) {
            System.out.println("num is: "+  num2);
        }
        else {
            System.out.println("num is"+ num3);
        }
        sc.close();
    }   
}
