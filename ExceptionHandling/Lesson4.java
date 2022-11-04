package ExceptionHandling;

//Unchecked Exception - ArithmeticException(runtime)
class Demo {
    static void fun1() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getCause());
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }
}

public class Lesson4 {
    public static void main(String[] args) {
        Demo.fun3();
    }
}
