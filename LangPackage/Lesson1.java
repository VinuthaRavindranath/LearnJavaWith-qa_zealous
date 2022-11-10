package LangPackage;

//java.lang.Object
class MyObj1 {

    public String toString() {
        return "My Object";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    // public void wait(){

    // } cannot over-ride wait() and notify()

}

class MyObj2 extends MyObj1 {
}

public class Lesson1 {
    public static void main(String[] args) {
        Lesson1 l1 = new Lesson1();
        System.out.println("toString() of l1 object : " + l1.toString());
        System.out.println("hashCode() of l1 object : " + l1.hashCode());
        MyObj1 mo1 = new MyObj1();
        System.out.println("toString() of mo1 object : " + mo1.toString());// over-ridded the toString()
        System.out.println("hashCode() of mo1 object : " + mo1.hashCode());

        System.out.println(l1.equals(mo1));

        MyObj2 mo2 = new MyObj2();
        System.out.println(mo1.equals(mo2));
    }
}
