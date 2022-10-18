package OOPS.Polymorphism.MethodOverloading;

import java.util.Scanner;

public class Lesson3 {
    public int reverse(int n){
        int rev= 0;
        while (n!=0) {
            int remainder = n % 10;
            rev = rev*10+remainder;
            n = n/10;
        }
        return rev;
    }

    public int[] reverse( int a[]){
        int[] b = new int[a.length];
         for (int i = a.length-1, j=0; i >=0; i--,j++) {
             b[j] = a[i];
         }
        return b ;
    }
    
    public static void main(String[] args) {
        Lesson3 reverseNumber = new Lesson3();

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        int reversedNumber =reverseNumber.reverse(n);
        System.out.println("Reversed number is : "+ reversedNumber);

        System.out.print("Enter values if an array"+ " ");
        int[] a = new int[5];
         for (int i = 0; i < a.length; i++) {
             a[i]=sc.nextInt();
         }

        int[] reversedArray = reverseNumber.reverse(a);
        for (int b : reversedArray) {
            System.out.print(b + " ");    
        }
        sc.close();
    }
}
