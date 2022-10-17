package MethodsExamples;
// Java program to find all the  prime numbers from 1 to N
import java.util.Scanner;

public class Lesson8 {
    
    static void prime_N(int N)
    {
        int x, y, flg;
        System.out.println("All the Prime numbers within 1 and " + N + " are:");
        for (x = 1; x <= N; x++) {
            if (x == 1 || x == 0)
                continue;
            flg = 1;
 
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.print(x + " ");
        }
    }
 
    // The Driver code
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int N =sc.nextInt();
        prime_N(N);
        sc.close();
    }
}
