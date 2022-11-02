package AccessModifier.MyPackage1;

public class Lesson1 {
    int a = 10;
    private int b = 20;
    protected int c = 30;
    public int d = 40;

    static int e = 11;
    private static int f = 21;
    protected static int g = 31;
    public static int h = 41;

    public void display() {
        int sum = a + b + c + d;
        System.out.println("Sum is:" + sum);
        int sum2 = e + f + g + h;
        System.out.println("Sum2 is:" + sum2);
    }
}
