package InnerClass;

class Outer {
    int x = 10;

    class Inner {
        int y = 11;

        public void displayIn() {
            System.out.println("Inner class" + x + " " + y);
        }

    }

    public void displayOut() {
        Inner in = new Inner();
        in.displayIn();
        System.out.println("Outer class" + x + " " + in.y);
    }

}

public class Lesson1 {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.displayOut();
        Outer.Inner i = new Outer().new Inner();
        i.displayIn();
    }
}
