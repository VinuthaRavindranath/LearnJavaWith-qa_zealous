package LangPackage;

//Java.lang.Integer Class
public class Lesson3 {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(5);
        int b = 5;
        System.out.println(a.equals(b));

        Integer c = Integer.valueOf(15);
        Integer d = Integer.valueOf(15);
        System.out.println(c.equals(d));

        int e = 10;
        Integer f = Integer.valueOf("1010", 2);
        System.out.println(f);
        System.out.println(f.equals(e));
        System.out.println(f.compareTo(e));
        System.out.println(f.compareTo(d));
        System.out.println(Integer.min(e, c));
        System.out.println(Integer.max(e, c));
        System.out.println(Integer.reverse(a));
        System.out.println(Integer.parseInt("12345"));
        System.out.println(Integer.sum(e, b));

    }
}
