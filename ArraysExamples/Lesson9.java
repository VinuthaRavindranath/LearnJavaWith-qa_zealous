package ArraysExamples;

import java.util.Scanner;

//Right Rotation of an array
public class Lesson9 {
    public int[] array(){
        int A[] = new int[10];
        System.out.println("Enter the value of an array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }
        sc.close();
        return A;
    }
    
    public static void main(String[] args) {
        Lesson9 values =new Lesson9();
        int arrelements[]=values.array();
        int temp = arrelements[arrelements.length-1];

        for (int i =arrelements.length -1 ; i >0; i--) {
            arrelements[i]=arrelements[i-1];
        }

        arrelements[0]=temp;

        for (int rightShift : arrelements) {
            System.out.println("Print right Shifted array: "+ rightShift);
        }
    }
}
