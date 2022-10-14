package ArraysExamples;

import java.util.Scanner;

//Returning Array from the Method
public class Lesson3 {

    public int[] get(){
        int[] A= new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values of an array");
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();   
        }
        sc.close(); 
        return A;
    }  

    public static void main(String[] args) {
        Lesson3 display = new Lesson3();
        int[] displayValues = display.get();
        for (int i = 0; i < displayValues.length; i++) {
            System.out.println("display array values " + displayValues[i]);
        } 
    }
}
