package ExceptionHandling;

//Unchecked Exception - NullPointerException(runtime)
class Demo2 {
    static void fun1() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}

public class Lesson5 {
    public static void main(String[] args) {
        Demo2.fun1();
    }
}
