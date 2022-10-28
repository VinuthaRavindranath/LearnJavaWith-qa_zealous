package InnerClass;

//local inner class
abstract class My {
    abstract public void show2();
}

interface My2 {
    public void show3();
}

class OuterNew {

    public void display() {
        class Inner { // local inner class
            public void show() {
                System.out.println("Inner class show method");
            }
        }

        My m = new My() {
            @Override
            public void show2() {
                System.out.println("Inner class show2 method");
            }
        };

        My2 m2 = new My2() {
            @Override
            public void show3() {
                System.out.println("Inner class show3 method");
            }
        };

        Inner in = new Inner();
        in.show();
        m.show2();
        m2.show3();
    }

}

public class Lesson2 {
    public static void main(String[] args) {
        OuterNew ot = new OuterNew();
        ot.display();
    }
}
