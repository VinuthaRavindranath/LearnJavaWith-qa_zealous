package ArraysExamples;
//Search if a an element/value is present in the array
import java.util.Scanner;

public class Lesson5 {
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
        System.out.println("Enter the element to be searched");
        Scanner sc = new Scanner(System.in);
        int elementToBeSearched=sc.nextInt();
        Lesson5 searchAnElement = new Lesson5();
        int values[]=searchAnElement.array();
        for (int element : values) {
            if (element== elementToBeSearched) {
                System.out.println("the element is present in the array");
                System.exit(0);
            }
        }
        System.out.println("the element is not present in the array");
        sc.close();
    }
}
