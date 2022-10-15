package ArraysExamples;

import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {
        int A[] = new int[5];
        int B[] = new int[10];

        System.out.println("Enter the values of an array");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        for (int i= A.length-1, j=0; i>=0; i--,j++) {
            System.out.println(A[i]);
            B[j]=A[i];
        }

        for (int copiedBArray : B) {
            System.out.println("B array values is: "+ copiedBArray);
        }
        sc.close();
    }
}
