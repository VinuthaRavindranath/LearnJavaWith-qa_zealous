import java.util.Scanner;

public class MinAndMaxArray {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Enter the values of the array");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] <min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("minimum "+ min);
        System.out.println("maximum "+ max);
    }
}
