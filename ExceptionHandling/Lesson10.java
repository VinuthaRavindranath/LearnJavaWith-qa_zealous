package ExceptionHandling;

//Diff between throw and throws
import java.util.Scanner;

public class Lesson10 {

    static int method1(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("Value should not be nagative");
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
