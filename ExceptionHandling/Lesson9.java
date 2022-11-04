package ExceptionHandling;

//custom exception, we need to extend Exception class that belongs to java.lang package.
class Demo6 extends Exception {
    public String toString() {
        return "Balance should not be less than 5000";
    }
}

public class Lesson9 {
    static void fun() {
        try {
            throw new Demo6();
        } catch (Demo6 e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Lesson9.fun();
    }
}
