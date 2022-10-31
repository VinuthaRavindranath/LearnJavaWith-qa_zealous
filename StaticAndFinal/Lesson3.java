package StaticAndFinal;

//final keyword, final method and final class
class DemoFinal {

    final static float NUM = 1234.567f; // 1st way to declare and initialize final variable
    final float NUM3;

    public static void display() {
        final float NUM2 = 2234.567f; // 2nd way is to do inside static method
        System.out.println(NUM2);
    }

    DemoFinal(float NUM3) {
        this.NUM3 = NUM3; // 3rd way is inside a constructor
        System.out.println(NUM3);
    }

}

class DemoFinal2 {
    final float NUM4;

    DemoFinal2() {
        NUM4 = 55.99f;
        System.out.println(NUM4); // 3rd way is inside a constructor
    }

    final static void display2() {
        System.out.println("Hi");
    }
}

class DemoFinal3 extends DemoFinal2 {

    // final static void display2() { cannot override final method (method
    // overriding is not possible whem method is final ,also not if a class in final
    // then it cannot be extented/inherited)
    // System.out.println("Hello");
    // }
}

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println(DemoFinal.NUM);
        DemoFinal.display();
        // DemoFinal.num=333.111f; final data cannot be re-assigned
        DemoFinal df = new DemoFinal(44.33f);
        DemoFinal2 df2 = new DemoFinal2();

    }
}