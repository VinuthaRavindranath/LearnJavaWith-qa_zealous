package OOPS.Interface;

interface Test {
    int X = 10;// final static int X = 10;

    public void method1();// public abstract void method1();

    public void method2();// public abstract void method2();

    default void method3() { // from Java 8 default methods are allowed inside interface
        System.out.println("From method3 in test interface");
        method5();
    }

    private void method5() { // from java 9 privaite methods are allowed inside interface
        System.out.println("From method5 in test interface");
    }
}

interface Test2 extends Test {
    void method4(); // public abstract void method1();
}

class My implements Test2 {
    @Override
    public void method1() {
        System.out.println("From method1 in test2 interface");
    }

    @Override
    public void method2() {
        System.out.println("From method2 in test2 interface");
    }

    @Override
    public void method4() {
        System.out.println("From method4 in test2 interface");
    }
}

public class Lesson4 {
    public static void main(String[] args) {
        My m = new My();
        m.method1();
        m.method2();
        m.method3();
        m.method4();

        Test t1 = new My();
        t1.method1();
        t1.method2();
        t1.method3();

        Test2 t2 = new My();
        t2.method1();
        t2.method2();
        t2.method3();
        t2.method4();
    }
}
