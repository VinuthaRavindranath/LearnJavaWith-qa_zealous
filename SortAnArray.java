import java.util.Scanner;

public class SortAnArray {
    public static void main(String[] args) {
        System.out.println("Enter the length of an array");
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();

        System.out.println("Enter the value of an array");
        int arr[]= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }

        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                } 
            }   
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);  
        }
        scanner.close();
    }
}
