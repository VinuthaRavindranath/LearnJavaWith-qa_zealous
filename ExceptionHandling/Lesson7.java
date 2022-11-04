package ExceptionHandling;

//Unchecked Exception - ArrayIndexOutOfBoundsException(runtime)
class Demo4 {
    static void fun1() {
        try {
            int a[] = new int[5];
            a[10] = 50;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}

public class Lesson7 {
    public static void main(String[] args) {
        Demo4.fun1();
    }
}
