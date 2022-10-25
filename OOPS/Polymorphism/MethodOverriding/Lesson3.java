package OOPS.Polymorphism.MethodOverriding;

class Parent {

    public Parent display(int i, int j) {
        System.out.println("Parent class: display" + i + j);
        return new Parent();
    }
}

class Child extends Parent {
    @Override
    public Child display(int i, int j) {
        System.out.println("Child class" + i + j);
        return new Child();
    }
}

public class Lesson3 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display(10, 15);
    }
}
