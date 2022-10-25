package OOPS.Polymorphism.MethodOverriding;

//method overriding and dynamic method dispatch
class Super {
    public void display() {
        System.out.println("Hello");
    }
}

class Sub extends Super {
    @Override
    public void display() { // Method overriding
        System.out.println("Hello World");
    }
}

public class Lesson1 {
    public static void main(String[] args) {
        Super sup = new Sub();// dynamic method dispatch where in using Super class ref, sub class object is
                              // created
        sup.display();
    }
}
