import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Enter the length of an array");
        Scanner scanner = new Scanner(System.in);
        int lengthOfArray =scanner.nextInt();

        System.out.println("Enter the value of an array");
        int arr[] = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            arr[i]=scanner.nextInt();    
        }

        int temp;
        int start = 0;
        int end = lengthOfArray-1;
        while (start<end) {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;    
        }

        System.out.println("Printing the reversed array");
        for (int j = 0; j < lengthOfArray; j++) {
            System.out.println(arr[j]);
        }

    }

}
