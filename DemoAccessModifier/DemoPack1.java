package DemoAccessModifier;

import AccessModifier.MyPackage1.Lesson1;

public class DemoPack1 {
    public static void main(String[] args) {
        Lesson1 l1 = new Lesson1();
        l1.display();
        // System.out.println(l1.a); default members cannot be accessed by classes
        // outside package
        // System.out.println(l1.b); private members cannot be accessed by classes
        // outside package
        // System.out.println(l1.c); protected members cannot be accessed by classes
        // outside package
        System.out.println(l1.d);
        System.out.println(Lesson1.h);
    }

}
