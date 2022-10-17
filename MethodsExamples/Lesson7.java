package MethodsExamples;
import java.util.Scanner;
//Given number is a prime number or not
public class Lesson7 {

    public boolean isPrime(int n){
        for (int i = 2; i < n/2; i++) {
            if (n%i==0 ) {
            return false;
            } 
        }
        return true; 
    }


    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        Lesson7 checkPrime = new Lesson7();
        boolean result=checkPrime.isPrime(n);
        System.out.println("is it a prime number :" + result);
        sc.close();
    }
}
