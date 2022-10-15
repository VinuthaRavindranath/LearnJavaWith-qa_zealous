package ArraysExamples;
//2D array
import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) {

        int A[][]= new int[3][3];
        int B[][] = {{2,4,6},{3,6,9},{4,8,12}};
        int C[][];
        C=new int [3][3];

        
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j]+ " ");
            }
            System.out.println(" ");
        }

        for (int x[] : B) {
            for (int y : x) {
                System.out.print(y+ " ");
            }
            System.out.println(" ");
        }

        System.out.print("Enter the values of array A: " + " ");
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j]=sc.nextInt();
            }    
        }

        for (int z[] : A) {
            for (int v : z) {
                System.out.print(v+ " ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
