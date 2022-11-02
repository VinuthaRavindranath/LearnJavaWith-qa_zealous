package Packages.InnerPackage.SubPackage;

import Packages.InnerPackage.*;
import Packages.*;

public class Lesson3 extends Lesson4 // IS-A Lesson3 Is A Lesson4
{
    public static void main(String[] args) {
        Lesson1 l1 = new Lesson1(); // HAS-A Lesson3 Has A object of Lesson1
        l1.display1();
        Lesson2 l2 = new Lesson2(); // HAS-A Lesson3 Has A object of Lesson2
        l2.display2();
        System.out.println("Lesson3 from inner most class");
        Lesson4 l4 = new Lesson4();
        l4.display4();
    }

}
