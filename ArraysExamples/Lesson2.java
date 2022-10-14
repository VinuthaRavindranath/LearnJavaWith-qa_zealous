package ArraysExamples;

import java.util.Scanner;

public class Lesson2 {
    int A[];

   public void array(int A[ ]){
    System.out.println("value of index 2 is : "+A[2]);
    A[2]=99;
    System.out.println("value of index 2 after update : "+A[2]);
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of an array");
        int R[]= new int[5];

        for (int i = 0; i < R.length; i++) {
            R[i] = sc.nextInt();    
        }
        for (int arrayValues : R) {
            System.out.println("Values of array : "+ arrayValues);
        }
        Lesson2 retrive = new Lesson2();
        retrive.array(R);
        sc.close();
    }  
}
