package AccessModifier.MyPackage2;

import AccessModifier.MyPackage1.Lesson1;

public class Lesson4 extends Lesson1 {

    public void show() {
        // System.out.println(a); default members cannot be accessed by classes
        // outside package
        // System.out.println(b); private members cannot be accessed by classes
        // outside package
        System.out.println(c);
        System.out.println(d);
        display();
    }

    public static void main(String[] args) {
        Lesson4 l4 = new Lesson4();
        l4.show();
        // System.out.println(e); default members cannot be accessed by classes
        // outside package
        // System.out.println(l1.f); private members cannot be accessed by classes
        // outside package
        System.out.println(g);
        System.out.println(h);
    }
}
