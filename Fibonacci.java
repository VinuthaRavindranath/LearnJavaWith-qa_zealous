import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();

        int fib =0, a=0 , b=1;

        while (fib<=n) {
            fib = a+b;
            a=b; 
            b=fib; 
            System.out.println(b);
        }
        scanner.close();
    }
}
