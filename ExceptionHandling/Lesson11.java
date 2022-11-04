package ExceptionHandling;

//custom exception
import java.util.Scanner;

class NegativeDimensionException extends Exception {
    public String toString() {
        return "Value should not be nagative";
    }
}

public class Lesson11 {
    static int method1(int a, int b) throws NegativeDimensionException {
        if (a < 0 || b < 0) {
            throw new NegativeDimensionException();
        }
        return a * b;

    }

    static void method2() {
        System.out.println("Enter value of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int r = method1(a, b);
            System.out.println(r);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        sc.close();
    }

    public static void main(String[] args) {
        method2();
    }

}
