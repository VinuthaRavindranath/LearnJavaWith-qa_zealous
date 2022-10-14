package ArraysExamples;

import java.util.Scanner;

//Left Rotation of an array
public class Lesson8 {
    
    public int[] array(){
        int A[]= new int[10];
        System.out.println("Enter the values of an array : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }
        sc.close();
        return A;
    }
    public static void main(String[] args) {
        Lesson8 values = new Lesson8();
        int arrelements[]=values.array();
        int temp= arrelements[0];
        for (int i = 1; i < arrelements.length; i++) {
            arrelements[i-1] = arrelements[i];
        }
        arrelements[arrelements.length-1]=temp;

        for (int shiftLeftArray : arrelements) {
            System.out.println("Print complete array "+ shiftLeftArray);
        }
    }
}
