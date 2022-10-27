package OOPS.Interface;

interface Super {
    public void display1();

    public void display2();
}

class Sub implements Super {
    @Override
    public void display1() {
        System.out.println("Display1 from sub class");
    }

    @Override
    public void display2() {
        System.out.println("Display2 from sub class");
    }

    public void display3() {
        System.out.println("Display3 from sub class");
    }
}

public class Lesson1 {
    public static void main(String[] args) {
        Super sup = new Sub();
        sup.display1();
        sup.display2();
        // sup.display3(); this gives an error
    }
}
