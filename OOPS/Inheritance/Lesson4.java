package OOPS.Inheritance;

//constructors in inheritace
class Parent {
    public Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("Grand Child constructor");
    }
}

public class Lesson4 {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
    }
}
