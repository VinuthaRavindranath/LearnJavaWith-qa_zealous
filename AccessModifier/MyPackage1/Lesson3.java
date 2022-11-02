package AccessModifier.MyPackage1;

public class Lesson3 extends Lesson1 {
    public void show() {
        System.out.println(a);
        // System.out.println(b); // private members cannot be accessed by classes
        // outside package
        System.out.println(c);
        System.out.println(d);
        display();
    }

    public static void main(String[] args) {
        Lesson3 l3 = new Lesson3();
        l3.show();
        System.out.println(e);
        // System.out.println(l1.f); private members cannot be accessed by classes
        // outside package
        System.out.println(g);
        System.out.println(h);
    }
}
