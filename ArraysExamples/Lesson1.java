package ArraysExamples;

import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) {
        int A[] = new int[3]; //different ways to write an array
        A[0]= 33;
        A[1]=44;
        A[2]=55;
       // A[3]=66;

        int B[]= {10,9,22,5,11}; //different ways to write an array

        int []C; //different ways to write an array
        C = new int[5];

        int[] D = new int[4]; //different ways to write an array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of an array");
        for (int i = 0; i < D.length; i++) {
            D[i]=sc.nextInt();      
        }

        for (int displayArrayB : B) {
            System.out.println("Display B array values :" + displayArrayB); //foreach is used only to display the values
            //System.out.println("Display B array values :" + displayArray++);//this will not increment the values of an array
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]++);
        }

        for (int displayArrayB : B) {
            System.out.println("Display B array values :" + displayArrayB);//again when i use foreach to display array values, incremnted values will be displayed
        }

        for (int displayArrayA : A) {
            System.out.println("Display A array values :" + displayArrayA); //throws ArrayIndexOutOfBoundsException if length of the array in negative, equal to the array size or greater than the array size while traversing the array(uncomment A[3])
        }

        for (int displayArrayD : D) {
            System.out.println("Display D array values :" + displayArrayD);
        }
        sc.close();

    }
    
}
