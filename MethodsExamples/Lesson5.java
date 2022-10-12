package MethodsExamples;

import java.util.Scanner;
// with return type as int
public class Lesson5 {
    public int add(int x , int y){
        int z=x+y;
        return z;
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        Lesson5 sum = new Lesson5();
        int addition =sum.add(a, b); //add() method called by main()/called method
        System.out.println("sum: "+ addition);
        sc.close();
    }
}
