package IfConditionExamples;
import java.util.Scanner;
// Java program to illustrate nested teranary
public class Lesson8 {
    public static void main(String[] args) {
        System.out.println("Enter a three numbers");
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();
        int maxnum = (num1 > num2)?((num1> num3)? num1: num3) : ((num2> num3)? num2: num3);
        System.out.println("max number is "+ maxnum);
        sc.close();
    }
}
