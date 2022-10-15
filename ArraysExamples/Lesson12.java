package ArraysExamples;
//everse Copying an Array
import java.util.Scanner;

public class Lesson12 {
    public static void main(String[] args) {
        int A[] = new int[5];
        int B[] = new int[10];

        System.out.println("Enter the values of an array");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        A=B;
        System.out.println("Length of A="+A.length);
        sc.close();
    }
}
