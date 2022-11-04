package ExceptionHandling;

import java.util.Scanner;

//Unchecked Exception - ArithmeticException(runtime) using throw keyword
class Demo12 {
    static int fun1(int a, int b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("Value cannot be negative");
        }
        return a * b;

    }

    static void fun2() {
        System.out.println("Enter value of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = fun1(a, b);
        System.out.println(r);
        sc.close();
    }
}

public class Lesson12 {
    public static void main(String[] args) {
        Demo12.fun2();
    }
}
