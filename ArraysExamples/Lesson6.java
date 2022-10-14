package ArraysExamples;
//Find maximum element in an array
import java.util.Scanner;

public class Lesson6 {
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
        Lesson6 find = new Lesson6();
        int findMaxELement[]=find.array();
        int max =findMaxELement[0];
        for (int element : findMaxELement) {
            if (element>max) {
                max = element;
            }
        }
        System.out.println("Max element is: "+max);
    }
}
