package ExceptionHandling;

//Unchecked Exception - NumberFormatException(runtime)
class Demo3 {
    static void fun1() {
        try {
            String s = "abc";
            int i = Integer.parseInt(s);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}

public class Lesson6 {
    public static void main(String[] args) {
        Demo3.fun1();
    }
}
