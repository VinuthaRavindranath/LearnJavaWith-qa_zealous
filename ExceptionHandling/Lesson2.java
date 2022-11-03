package ExceptionHandling;

//nested try and catch
import java.util.Scanner;

public class Lesson2 {
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
            try {
                System.out.println(arr[7]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is invalid");
            }

        } catch (ArithmeticException e) {
            System.out.println("Dinominator should not be 0, try again ");
        }
        sc.close();
    }
}
