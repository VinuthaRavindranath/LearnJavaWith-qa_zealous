package MethodsExamples;
import java.util.Scanner;
//Passing multiple parameter 
public class Lesson4 {

    public void change(int A[],int i, int value){
        A[i]=value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 numbers");
        int A[] = new int[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("enter the value of i");
        int index = sc.nextInt();
        System.out.println("enter the value");
        int value = sc.nextInt();
        Lesson4 update = new Lesson4();
        update.change(A,index, value);

        for (int updateArray : A) {
            System.out.println("updated array is " +updateArray);
        }
        sc.close();
    }
}
