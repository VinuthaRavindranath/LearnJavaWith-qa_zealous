package InnerClass;

//static inner class
class Outer2 {
    public static int A = 10;
    public static int B = 20;
    public int C = 30;

    static class Inner2 { // static inner class
        public void show() {
            System.out.println(A);
            System.out.println(B);
            // System.out.println(C); cant use this as static inner class can access only
            // static outer class

            Outer2 ou = new Outer2();
            System.out.println(ou.C);
        }

    }

}

public class Lesson3 {
    public static void main(String[] args) {
        Outer2.Inner2 oi = new Outer2.Inner2();
        oi.show();
    }
}
