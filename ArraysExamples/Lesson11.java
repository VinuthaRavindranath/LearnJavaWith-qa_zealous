package ArraysExamples;

import java.util.Scanner;
//copying elements of Array A to Array B
public class Lesson11 {

    public static void main(String[] args) {
        
        int A[]=new int[10];
        int B[]=new int[A.length];

        System.out.println("Enter the values of an array");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        for (int copiedBArray : B) {
            System.out.println("B array values is: "+ copiedBArray);
        }
        sc.close();

    }
}
