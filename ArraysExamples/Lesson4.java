package ArraysExamples;

import java.util.Scanner;
//finding sum of all elements
public class Lesson4 {

    public int[] array(){
        int A[] = new int[5];
        System.out.println("Enter the elements of an array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }
        sc.close();
        return A;
    }
    public static void main(String[] args) {
        int sum =0;
        Lesson4 sumOfArray = new Lesson4();
        int values[] = sumOfArray.array();
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        System.out.println("Sum of values of an array is: "+ sum);

        
    }
}
