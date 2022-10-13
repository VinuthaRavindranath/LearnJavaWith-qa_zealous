package ArraysExamples;

import java.util.Scanner;

public class Lesson1 {
    int A[];

   public void array(int A[ ]){
    System.out.println("value of index 2 is : "+A[2]);
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
        Lesson1 retrive = new Lesson1();
        retrive.array(R);
        sc.close();
    }  
}
