package AccessModifier.MyPackage1;

public class Lesson2 {
    public static void main(String[] args) {
        Lesson1 l1 = new Lesson1();
        l1.display();
        System.out.println(l1.a);
        // System.out.println(l1.b); // private members cannot be accessed by classes
        // outside package
        System.out.println(l1.c);
        System.out.println(l1.d);
        System.out.println(Lesson1.e);
        // System.out.println(l1.f); private members cannot be accessed by classes
        // outside package
        System.out.println(Lesson1.g);
        System.out.println(Lesson1.h);
    }

}
