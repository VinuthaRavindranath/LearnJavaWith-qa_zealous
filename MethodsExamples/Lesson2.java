package MethodsExamples;

import java.util.Scanner;

public class Lesson2 {

    public void max(int a, int b){
        if (a>b) {
            System.out.println("A is greater "+ a);
        } else {
            System.out.println("B is greater "+ b);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers :");
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       Lesson2 maxnumber = new Lesson2(); // we need to create an object to access the non static methods in static main method
       maxnumber.max(a,b);
       sc.close();
    }
}
