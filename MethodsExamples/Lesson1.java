package MethodsExamples;

import java.util.Scanner;

public class Lesson1 {

    public static void max(int a, int b) { // this method should be static
        if (a>b) {
            System.out.println("A is greater " + a);
            
        } else {
            System.out.println("B is greater " + b);
        }     
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        max(a,b);
        sc.close();
    }
}
