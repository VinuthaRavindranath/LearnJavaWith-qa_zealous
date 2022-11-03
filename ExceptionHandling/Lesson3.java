package ExceptionHandling;

//We can have multiple catch blocks
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter elements of an array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        try {
            int c = arr[0] / arr[1];
            System.out.println("Division is : " + c);
            System.out.println(arr[7]);
        }
        // catch (Exception e) {
        // System.out.println("Dinominator should not be 0, try again ");
        // } we cannot write like above, hirerarchy of catch blocks when we have
        // multiple catch blocks

        catch (ArithmeticException e) {
            System.out.println("Dinominator should not be 0, try again ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }
        sc.close();
    }
}
