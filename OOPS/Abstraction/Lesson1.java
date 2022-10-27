package OOPS.Abstraction;

//abstract class with abstract method
abstract class Super {

    public Super() {
        System.out.println("Super class construtor");
    }

    public void display1() {
        System.out.println("Super class display method");
    }

    abstract public void display2();// abstract method will not have method signature
}

class Sub extends Super {
    @Override
    public void display2() {
        System.out.println("sub class display method");
    }
}

public class Lesson1 {
    public static void main(String[] args) {
        // Super s = new Super(); // we cannot create an object of abstract class,
        // Inheritance is mandatory and method overriding should be used to override the
        // abstract method
        Super sup = new Sub();
        sup.display1();
        sup.display2();
    }
}
